package exp81;

import java.util.Scanner;

public class Exp81 {

	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		//Course grade1 = new Course(10, 10, 100,100);//for test
		Course grade1 = askInputObject();
		System.out.println(grade1);
	}//main 

	private static Course askInputObject() {
		int min = 0, maxQuize = 10, maxExam = 100;

		askNum("first quize", min, maxQuize);
		int quize1 = inputNum(maxQuize);
		
		askNum("second quize", min, maxQuize);
		int quize2 = inputNum(maxQuize);
		
		askNum("midterm Exam ", min, maxExam);
		int midtermExam = inputNum(maxExam);
		
		askNum("final Exam ", min, maxExam);
		int finalExam = inputNum(maxExam);
		
		Course grade1 = new Course(quize1, quize2, midtermExam, finalExam);

		return grade1;
	}

	static void askNum(String string, int min, int max) {
		System.out.println("Input the points of the " + string + " the range is " + min + " --> " + max);
	}

	static int inputNum(int max) {
		int num = 0, min = 0;
		while (true) {
			try {
				num = reader.nextInt();
				if (num >= min && num <= max) {
					break;
				} else {
					System.out.printf(num + " is out of range %d  --> %d try again ", min, max);
				} // if else
			} catch (Exception e) {
				System.out.println("Error, try integer numbers ");
				reader.nextLine();
			}
		} // while
		return num;
	}
}