package core.java.InterviewQuestions_And_TrickyJavaQuestions;

import java.util.Arrays;

public class Smallest_And_Largest_Number {

	public static void main(String[] args) {

		int number[] = { -10, 24, 50, -88, 987656, 0 };
		//int numbers[] = {0, -1};

		int largest = number[0];
		int smallest = number[0];
		
		// Time Complexity is O(n).
		for (int i = 1; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			} 
			else {
				if (number[i] < smallest) {
					smallest = number[i];
				}
			}
		}

		System.out.println("\ngiven array is: " + Arrays.toString(number));
		System.out.println("largest number is: " + largest);
		System.out.println("Smallest number is: " + smallest);

	}
}