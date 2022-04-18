package core.java.Star_Pattern_Interview_Questions;

public class AlphabetPattern2 {

	public static void main(String[] args) {

		// A-Z - 65 to 90
		// a-z - 97 to 122

//		A 
//		B B 
//		C C C 
//		D D D D 
//		E E E E E 
//		F F F F F F 

		int alpha = 65;

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) alpha + " ");
			}
			alpha++;
			System.out.println();
		}
		
//-------------------------------------------------------------------------------------------------------------------------------

//		a 
//		b b 
//		c c c 
//		d d d d 
//		e e e e e 
//		f f f f f f

		int alpha1 = 97;

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) alpha1 + " ");
			}
			alpha1++;
			System.out.println();
		}
//-------------------------------------------------------------------------------------------------------------------------------

//		A 
//		A A 
//		A A A 
//		A A A A 
//		A A A A A 
//		A A A A A A 

		int alpha2 = 65;

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) alpha2 + " ");
			}
			// alpha2++;
			System.out.println();
		}

	}
}