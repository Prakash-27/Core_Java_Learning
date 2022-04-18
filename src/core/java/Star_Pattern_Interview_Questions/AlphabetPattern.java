package core.java.Star_Pattern_Interview_Questions;

public class AlphabetPattern {

	public static void main(String[] args) {

		// Printing the Alphabet Pattern... **

//		A
//		AB
//		ABC
//		ABCD
//		ABCDE
//		ABCDEF

		int alpha = 65;

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alpha + j));
			}
			System.out.println();
		}

//-------------------------------------------------------------------------------------------------------------------------------

//		A
//		CC
//		EEE
//		GGGG
//		IIIII
//		KKKKKK

		int alpha1 = 65;

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alpha1 + i));
			}
			alpha1++;
			System.out.println();
		}

//-------------------------------------------------------------------------------------------------------------------------------

//		a
//		ab
//		abc
//		abcd
//		abcde
//		abcdef

		int alpha2 = 97;

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alpha2 + j));
			}
			System.out.println();
		}

//------------------------------------------------------------------------------------------------------------------------------

//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 

		for (char line = 'A'; line <= 'E'; line++) {
			for (char c = 'A'; c <= line; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}

	}
}