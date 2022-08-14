package core.LAO.java.interview_Questions;

import java.util.Scanner;

public class FindThePositionOfEnglishAlphabet {
	
	/**
	 * How to find the position of an English Alphabet.
	 * @param args
	 */

	public static void main(String[] args) {

		//ASCII => 97 -> a, 65 -> A
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Character : ");
		
		char givenchar = sc.next().charAt(0);
		
		Character.toLowerCase(givenchar);
		
		int asciiValue = (int) givenchar;
		System.out.println(asciiValue);
		
		int position = asciiValue-96;
		
		System.out.println(position);
		
	}

}
