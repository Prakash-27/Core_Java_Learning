package core.LAO.java.interview_Questions;

import java.util.Scanner;

public class PrintFloydTriangle {

	public void trianglerRightSidePattern(int numberOfLines) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of lines: ");
//		int numberOfLines = sc.nextInt();

		int row, column = 0;

		for (row = 0; row < numberOfLines; row++) {
			for (column = 0; column <= row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------------------------");
	}

	public void traingleRightSideNumberPattern(int limit) {
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("Enter the Row Limit : ");
//		int limit;
//		limit = sc1.nextInt();

		int StartingNumber = 1;
		int row1, column1 = 0;

		for (row1 = 0; row1 <= limit; row1++) {
			for (column1 = 0; column1 <= row1; column1++) {
				System.out.print(StartingNumber + " ");
				// StartingNumber = StartingNumber + 1;
				StartingNumber++;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		PrintFloydTriangle triangle = new PrintFloydTriangle();
		triangle.trianglerRightSidePattern(5);
		triangle.traingleRightSideNumberPattern(5);

	}
}