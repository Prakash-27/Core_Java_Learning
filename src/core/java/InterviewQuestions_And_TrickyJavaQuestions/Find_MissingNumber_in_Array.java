package core.java.InterviewQuestions_And_TrickyJavaQuestions;

public class Find_MissingNumber_in_Array {

	public static void main(String[] args) {

		// int a[] = {1,2,4,5} --> here missing number is 3

		// Logic to implement in program

		// 1+2+4+5 = 12
		// 1+2+3+4+5 = 15
		// 15-12 = 3

		// int a[] = {1,2,3,4,5,7,8,9} --> here missing number is 3

		// 1+2+3+4+5+7+8+9 = 39
		// 1+2+3+4+5+6+7=8+9 = 45
		// 45-39 = 6

		// 1.
		int a[] = { 1, 2, 4, 5 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i]; // 12
		}
		System.out.println(sum);

		int sum1 = 0;

		for (int j = 1; j <= 5; j++) {
			sum1 = sum1 + j;// 15
		}
		System.out.println(sum1);

		System.out.println("Missing Number is: " + (sum1 - sum));

//------------------------------------------------------------------------------------------------------------------------------		
		
		// 2.
		int b[] = { -1, 0, 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int sum2 = 0;

		for (int i = 0; i < b.length; i++) {
			sum2 = sum2 + b[i];
		}
		System.out.println(sum2);

		int sum3 = 0;

		for (int j = -1; j <= 10; j++) {
			sum3 = sum3 + j;
		}
		System.out.println(sum3);

		System.out.println("Missing number is: " + (sum3 - sum2));

	}

}
