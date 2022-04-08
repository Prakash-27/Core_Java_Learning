package core.java.Interview_Questions;

public class FactorialNumber {

	//factorial of 3 is 3 * 2 * 1 = 6
	//factorial of 4 is 4 * 3 * 2 * 1 = 24
	//factorial of 5 is 5 * 4 * 3 * 2 * 1 = 120
	//factorial of 10 is 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 3628800
	//Always remember factorial 1 = 1 --> fact(1) = 1
	//Always remember factorial 0 = 1 --> fact(0) = 1
	
	//1. Without-Recursive function -- use for loop
	
	public static int factorial(int num) {
		System.out.println("Given Number is: "+num);
		if(num == 0)
			return 1;
		
		int fact = 1;
		
		for(int i=1; i<=num; i++) {
			fact = fact*i; //1*2*3*4
		}
		return fact;
	}
	
	
	//2. With Recursive Function: A Function is calling itself
	
	public static int fact(int num) {
		System.out.println("Given Number is: "+num);
		if(num == 0)
			return 1;
		
		else
			return (num * fact(num-1));
	}
	
	
	
	public static void main(String[] args) {

		//Without Recursive Function Method
		System.out.println(factorial(3));
		System.out.println(factorial(4));
		System.out.println(factorial(5));
		System.out.println(factorial(10));
		
		//With Recursive Function Method
		System.out.println(fact(10));
		System.out.println(fact(5));
		System.out.println(fact(4));
		System.out.println(fact(3));
		
		
	}

}
