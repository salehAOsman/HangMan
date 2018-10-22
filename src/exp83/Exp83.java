package exp83;

import java.util.Scanner;

public class Exp83 {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		Grade grade1 = new Grade(1, 4, 6, 2, 1);

		// Grade grade3 = new Grade(40, 40, 40, 40, 40);
		// Grade grade4 = new Grade(10, 10, 10, 10, 10);

		System.out.println(grade1);
		// System.out.println(grade3);
		// System.out.println(grade4);

		String s = "*";
		System.out.println("\n\n");
		int count = 1;
		System.out.println("0   10    20   30   40   50  60   70   80   90  100%");
		System.out.println("|    |    |    |    |    |    |    |    |    |    |");
		System.out.println("***************************************************");

		int num = grade1.getAsterisk_A();
		while (count <= num) {
			System.out.printf("%s", s);
			count++;
		}
		System.out.println("A");

		count = 1;
		num = grade1.getAsterisk_B();
		while (count <= num) {
			System.out.printf("%s", s);
			count++;
		}
		System.out.println("B");

		count = 1;
		num = grade1.getAsterisk_C();
		while (count <= num) {
			System.out.printf("%s", s);
			count++;
		}
		System.out.println("C");

		count = 1;
		num = grade1.getAsterisk_D();
		while (count <= num) {
			System.out.printf("%s", s);
			count++;
		}
		System.out.println("D");

		count = 1;
		num = grade1.getAsterisk_F();
		while (count <= num) {
			System.out.printf("%s", s);
			count++;
		}
		System.out.println("F");

	//next grafic
		
		System.out.println("\n\n");
		 Grade grade2 = new Grade(20, 20, 20, 20, 20);
			System.out.println("\n\n");
		 System.out.println(grade2);
		 count = 1;
		System.out.println("0   10    20   30   40   50  60   70   80   90  100%");
		System.out.println("|    |    |    |    |    |    |    |    |    |    |");
		System.out.println("***************************************************");

		 num = grade2.getAsterisk_A();
		while (count <= num) {
			System.out.printf("%s", s);
			count++;
		}
		System.out.println("A");

		count = 1;
		num = grade2.getAsterisk_B();
		while (count <= num) {
			System.out.printf("%s", s);
			count++;
		}
		System.out.println("B");

		count = 1;
		num = grade2.getAsterisk_C();
		while (count <= num) {
			System.out.printf("%s", s);
			count++;
		}
		System.out.println("C");

		count = 1;
		num = grade2.getAsterisk_D();
		while (count <= num) {
			System.out.printf("%s", s);
			count++;
		}
		System.out.println("D");

		count = 1;
		num = grade2.getAsterisk_F();
		while (count <= num) {
			System.out.printf("%s", s);
			count++;
		}
		System.out.println("F");

	}

}
