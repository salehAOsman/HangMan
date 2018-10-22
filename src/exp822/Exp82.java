package exp822;

import java.util.Scanner;

public class Exp82 {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		
		 // Person person1 = askInputObject(); Person person2 = askInputObject();
		  //Person person3 = askInputObject(); Person person4 = askInputObject();
		 
		// equals
		Person person1 = new Person("name1", 12);
		Person person2 = new Person("name1", 12);
		System.out.println("1 " + person1);
		System.out.println("2 " + person2);
		boolean twoEquals1 = person1.equals(person2);
		System.out.println("towEquals1: " + twoEquals1);

		Person person3 = new Person("name1", 12);
		Person person4 = new Person("name2", 12);
		System.out.println("1 " + person3);
		System.out.println("2 " + person4);
		boolean twoEquals2 = person3.equals(person4);
		System.out.println("towEquals2: " + twoEquals2);
		System.out.println("------------------");
		// equalName

		person1 = new Person("name1", 12);
		person2 = new Person("name1", 12);
		System.out.println("1 " + person1);
		System.out.println("2 " + person2);
		twoEquals1 = person1.equalsName(person2);
		System.out.println("towEqualsName1: " + twoEquals1);

		person1 = new Person("name1", 12);
		person2 = new Person("name2", 12);
		System.out.println("1 " + person1);
		System.out.println("2 " + person2);
		twoEquals1 = person1.equalsName(person2);
		System.out.println("towEqualsName2: " + twoEquals1);
		System.out.println("++++++++++++++++++++++");
		// equalAge

		person1 = new Person("name1", 12);
		person2 = new Person("name1", 12);
		System.out.println("1 " + person1);
		System.out.println("2 " + person2);
		twoEquals1 = person1.equalsAge(person2);
		System.out.println("towEqualsAge1: " + twoEquals1);

		person1 = new Person("name1", 12);
		person2 = new Person("name2", 11);
		System.out.println("1 " + person1);
		System.out.println("2 " + person2);
		twoEquals1 = person1.equalsAge(person2);
		System.out.println("towEqualsAge2: " + twoEquals1);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<");

		// equalOlder

		person1 = new Person("name1", 12);
		person2 = new Person("name1", 11);
		System.out.println("1 " + person1);
		System.out.println("2 " + person2);
		twoEquals1 = person1.oldeerAge(person2);
		System.out.println("oldeerAge1: " + twoEquals1);

		person1 = new Person("name1", 11);
		person2 = new Person("name2", 12);
		System.out.println("1 " + person1);
		System.out.println("2 " + person2);
		twoEquals1 = person1.oldeerAge(person2);
		System.out.println("oldeerAge2: " + twoEquals1);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

		// youngerAge

		person1 = new Person("name1", 11);
		person2 = new Person("name1", 12);
		System.out.println("1 " + person1);
		System.out.println("2 " + person2);
		twoEquals1 = person1.youngerAge(person2);
		System.out.println("youngerAge1: " + twoEquals1);

		person1 = new Person("name1", 12);
		person2 = new Person("name2", 11);
		System.out.println("1 " + person1);
		System.out.println("2 " + person2);
		twoEquals1 = person1.youngerAge(person2);
		System.out.println("youngerAge2: " + twoEquals1);
		System.out.println("????????????????????????????????????");

			
		
	}// main

	private static Person askInputObject() {
		int min = 1, max = 140;
		askName();

		String name = inputName();

		askNum(name, min, max);

		int age = inputNum(min, max);

		Person person = new Person(name, age);

		return person;
	}

	private static String inputName() {
//ToDo fix input number 		
		return reader.nextLine();
	}

	private static void askName() {
		// fix word first second name
		System.out.println("input a name ");
	}

	static void askNum(String name, int min, int max) {
		System.out.println("Input the age of " + name + " the range is " + min + " --> " + max);
	}

	static int inputNum(int min, int max) {
		int num = 0;
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
		reader.nextLine();
		return num;
	}
}
