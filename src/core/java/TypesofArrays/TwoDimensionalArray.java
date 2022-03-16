package core.java.TypesofArrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		String s[][] = new String[3][6]; 
		
		// it will get the  how many Row count.
		System.out.println("Row Count: "+s.length);
		// it will get the how many Column count. 
		//s[0] or s[1] or s[2] the columns are same in size, Only Rows are Different.
		System.out.println("Column Count: "+s[0].length);
		
		//1st Row:
		s[0][0] = "A0";
		s[0][1] = "B0";
		s[0][2] = "C0";
		s[0][3] = "D0";
		s[0][4] = "E0";
		s[0][5] = "F0";
		
		
		//2nd Row:
		s[1][0] = "A1";
		s[1][1] = "B1";
		s[1][2] = "C1";
		s[1][3] = "D1";
		s[1][4] = "E1";
		s[1][5] = "F1";
		
		
		//3rd Row:
		s[2][0] = "A2";
		s[2][1] = "B2";
		s[2][2] = "C2";
		s[2][3] = "D2";
		s[2][4] = "E2";
		s[2][5] = "F2";
		
		System.out.println(s[0][1]);
		System.out.println(s[1][5]);
	    System.out.println(s[2][3]);
	    
	    for(int row = 0; row < s.length; row++) {
	    	for(int col = 0; col < s[0].length; col++) {
	    		System.out.println(s[row][col]);
	    	}
	    }
	    
	}

}
