package core.java.InterviewQuestions_And_TrickyJavaQuestions;

public class SwapIntegerWithoutThirdVariable {

	public static void main(String[] args) {

		int x = 5; //0101
		int y = 10;//1010

		// 1. with using third var : t

//		int t;

//		t = x; //5
//		x = y; //10
//		y = t; //5

		// 2. without using third var: using + operator

//		x = x + y; 
//		y = x - y; 
//		x = x - y; 

		// 2. without using third var: using * operator

//		x = x * y; 
//		y = x / y; 
//		x = x / y; 

		// 3. Using XOR Operator: ^
		
		// ^ is adding the values
		
		//x = 0101 ^ 1010 => 1111 = 15  
		//y = 1111 ^ 1010 => 0101 = 5
		//x = 1111 ^ 0101 => 1010 = 10
		                                                               // 8421
		x = x ^ y; // 15 // This will take it like Bitwise Conversion --> 1111
		y = x ^ y; // 5
		x = x ^ y; // 10

		System.out.println(x);
		System.out.println(y);

	}

}
