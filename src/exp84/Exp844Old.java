package exp84;

import java.util.Scanner;

public class Exp844Old {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String secretWord = "22522332";
		String disguisedWord = "????????";
		int length = 0;

		int count = 0;
		int time = 0;
		int correct = 0;
		char input = '2';
		int d = 0;

		do {
			System.out.println("input char");
			input = reader.nextLine().charAt(0);
			time++; //total trying
			d++;
			break;
		} while ( true );

		while (true) {
			length = secretWord.length();
			// System.out.println(+count + " leng " + length); //
			int index = secretWord.indexOf( input ); // find index in secret

			if ( index == -1 ) {
				break;
			}
			// System.out.println(count + " index " + index);
			String beforS = secretWord.substring(0, index); // index > 0
			String nowS = secretWord.substring(index, index + 1);

			String afterS = secretWord.substring(index + 1, length); // index <= length-2

			// System.out.println(count + " bef " + beforS + " now " + nowS + " after " +
			// afterS);

			secretWord = beforS + "-" + afterS;
			System.out.println(count + " gusWBef  " + disguisedWord);
			String beforD = disguisedWord.substring(0, index); // index > 0

			String nowD = disguisedWord.substring(index, index + 1);
			String afterD = disguisedWord.substring(index + 1, length); // index <= length - 2

			// System.out.println(count + " befD " + beforD + " nowD " + nowD + " afterD " +
			// afterD);
			nowD = Character.toString(input); // found guess ch_
			disguisedWord = beforD + nowD + afterD; // rebuild word

			System.out.println(count + " newGusW   " + disguisedWord);
			System.out.println("newGusW " + beforD + nowD + afterD + "   correct " + correct + "  time/s " + time);

			System.out.println(" new SecP " + secretWord);
			System.out.println("=================");
			count++;
		}//while 
		
		//System.out.println("times : "+ time+"  correct "+ correct );
	}
}