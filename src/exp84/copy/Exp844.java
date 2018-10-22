package exp84.copy;

import java.util.Scanner;

public class Exp844 {
	static int time;
	static int correct;
	static String secretWord = "AA1BAFBD";
	static String disguisedWord = "????????";
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		int length = secretWord.length();
		char input = ' ';
		A:do {
			input = checkRightChar(input);
			String inp = Character.toString(input);
			checkIncrementCorrect(inp);
			if (secretWord.contains(inp)) {// CHECK BEFOR REPLACE if found simple
				replaceChar(length, input);
			}

			int count = 0;
			for (int i = 0; i < secretWord.length(); i++) {
				if (secretWord.charAt(i) == '*') {// to make break we need to check every char in secretWord to be as
					count++;
					if (count == secretWord.length()) {
						displayResult();
						break A;
					}
				}
			}

		} while (true);// loop
		
		System.out.println("I have done");
	
	}// main

	private static void checkIncrementCorrect(String inp) {
		if (secretWord.contains(inp))
			correct++;
		time++;
	}

	private static void displayResult() {
		System.out.println(
				secretWord + "\n\n\t finish\n *" + time + " time/s  \n *" + correct + " correct\t  " + disguisedWord);
	}

	private static char checkRightChar(char input) {
		do {
			System.out.println("Input char to guess hiden word:     " + disguisedWord);
			String c = reader.nextLine();
			int b = c.length();
			if (b != 1) {
				System.out.println("Error, try input just one char ");
			} else {
				input = c.charAt(0);
				break;
			}
		} while (true);// do loop to ask input right char
		return input;
	}

	private static void replaceChar(int length, char input) {
		int count = 0;
		do {
			count = secretWord.indexOf(input); // to not start or continue search before & after we find all char
			while ((count <= length - 1) && (count != -1)) {// out of range and we still have more same repeating char
															// like input
				if (input == secretWord.charAt(count)) {// check for next time for repeating char in secretWord to
														// change secretWord and disguisedWord
					String firstS = secretWord.substring(0, count);
					String lastS = secretWord.substring(count + 1, length);
					secretWord = firstS + "*" + lastS;

					String first = disguisedWord.substring(0, count);
					String last = disguisedWord.substring(count + 1, length);
					disguisedWord = first + input + last;

					System.out.println("in   " + count + "   " + disguisedWord + "    " + secretWord);// help and test

					if (!secretWord.contains(Character.toString(input))) {// CHECK BEFOR REPLACE if found simple
						break;
					}
				}
				count++;
			} // end loop
		} while (secretWord.contains(Character.toString(input))); // to cut between

	}// end replace
}