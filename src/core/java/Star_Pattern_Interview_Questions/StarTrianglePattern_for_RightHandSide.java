package core.java.Star_Pattern_Interview_Questions;

public class StarTrianglePattern_for_RightHandSide {

	public static void main(String[] args) {

		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
		for(int i=0; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
//---------------------------------------------------Combining both the triangle------------------------------------------------
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
