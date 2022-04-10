package core.java.InterviewQuestions_And_TrickyJavaQuestions;

import java.util.ArrayList;

public class Reverse_a_Integer {

	public static void main(String[] args) {

		// 1.Using While loop:
		int num = 123456789;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse number is: " + rev);

//-----------------------------------------------------------------------------------------------------------------------------		

		// 2.Using for loop:
		int number = 786438798;
		String string = Integer.toString(number);
		int len = string.length();

		String reverse = "";

		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}

		number = Integer.parseInt(reverse);
		System.out.println("Reverse a Integer Using For Loop: " + number);

//-----------------------------------------------------------------------------------------------------------------------------		 

		// 3.Using StringBuffer Method:
		int num1 = 87654568;

		// i)
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

		// ii)
		System.out.println(new StringBuffer(num1 + "").reverse().toString());

		// iii)
		String rev1 = String.valueOf(num1);
		StringBuffer sb = new StringBuffer(rev1);
		System.out.println("Reverse number using StringBuffer: " + sb.reverse());

//-----------------------------------------------------------------------------------------------------------------------------		

		//4.
		int k = 123456789;
		StringBuffer sb1 = new StringBuffer(Integer.toString(k));
		
		String str = sb1.reverse().toString();
		
		int Int = Integer.parseInt(str);
		
		System.out.println(Int);
		
//-----------------------------------------------------------------------------------------------------------------------------		

		// This is a Wrong Method to Find Reverse a Integer:
		// --------------------------------------------------

		// 4. using ArrayList

//		int i = 9798765;
//		
//		int rev2 = 0;
//		
//		ArrayList<Integer> digit_num = new ArrayList<Integer>();
//		
//		while(i>10) {
//			digit_num.add(i % 10);
//			i = i / 10;
//		}
//		
//		digit_num.add(i);
//		int lastInd = digit_num.size()-1;
//		
//		for(int j = lastInd; j >= 0; j--) {
//			rev2 = rev2 + (digit_num.get(j)*(int)Math.pow(10.0, (double)(lastInd-j)));
//		}
//		System.out.println(rev);
//		

	}
}