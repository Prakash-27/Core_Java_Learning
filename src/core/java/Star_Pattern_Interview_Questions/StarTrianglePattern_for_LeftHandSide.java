package core.java.Star_Pattern_Interview_Questions;

public class StarTrianglePattern_for_LeftHandSide {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5; i>=1; i--) {
			for(int j=1+i; j<=5; j++) { //1+i
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int k=1; k<=5-i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
	}

}
