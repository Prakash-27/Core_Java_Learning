package core.java.Star_Pattern_Interview_Questions;

public class DiamondTrianglePattern {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=5; i>=1; i--) {
			for(int j=1+i; j<=5; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//-----------------------------------------------------------------------------------------------------------------------------		
		
		for(int i=1; i<=5; i++) {
			for(int j=i; j<5; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<(i*2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4; i>=1; i--) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<(i*2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//------------------------------------------------------------------------------------------------------------------------------		

//		     1
//		    2 3
//		   4 5 6
//		  7 8 9 10
//		 11 12 13 14 15
		
		int count = 1;
		for(int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print(" "+count);
				count++;
			}
			System.out.println();
		}
		
//------------------------------------------------------------------------------------------------------------------------------		
		
//	     a 
//	    a a 
//	   a a a 
//	  a a a a 
//	 a a a a a 

		
		for(int i=1; i<=5; i++) {
			int a = 1;
			for(int j=4; j>=i; j--) {
				
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("a ");
				a++;
			}
			System.out.println();
		}
		
//-----------------------------------------------------------------------------------------------------------------------------		
		
//      	A 
//		   A A 
//		  A A A 
//		 A A A A 
//		A A A A A
		
		for(int i=1; i<=5; i++) {
			char ch = 'A';
			for(int j=4; j>=i; j--) {
				
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("A ");
				ch++;
			}
			System.out.println();
		}
		
//------------------------------------------------------------------------------------------------------------------------------		
		
//		b b b b b 
//		b b b b 
//		b b b 
//		b b 
//		b 
		
		for(int i=5; i>=1; i--) {
			int b = 1;
			for(int j=1; j<=i; j++) {
				System.out.print("b ");
				
			}
			System.out.println();
		}
		
		
	}

}
