package core.LAO.java.interview_Questions;

import java.util.Scanner;

public class Reverse_NumberExample {

	public static void reverseANumber(int givenNumber) {

		int reversedNumber = 0;

//		Scanner sc = new Scanner(System.in);
//		givenNumber = sc.nextInt();

		while (givenNumber != 0) {
			reversedNumber = reversedNumber * 10;
			reversedNumber = reversedNumber + givenNumber % 10;
			givenNumber = givenNumber / 10;
		}
		System.out.println(reversedNumber);

	}

	public static void reverseNumberusingtoCharArray(int number) {

		String stringnumber = Integer.toString(number);
		char[] characterArray = stringnumber.toCharArray();
		int len = characterArray.length;

		String reversed = "";

		for (int i = len - 1; i >= 0; i--) {
			reversed = reversed + characterArray[i];
		}

		number = Integer.parseInt(reversed);
		System.out.println("Reverse a Number using toCharArray: " + number);
	}

	public static void main(String[] args) {

		reverseANumber(123456789);
		reverseNumberusingtoCharArray(543216789);

	}

}
