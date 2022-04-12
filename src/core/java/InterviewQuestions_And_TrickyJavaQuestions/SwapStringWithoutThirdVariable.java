package core.java.InterviewQuestions_And_TrickyJavaQuestions;

public class SwapStringWithoutThirdVariable {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "World";

		System.out.println("Before Swapping");
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);

		System.out.println("------------------------------------");

		// 1. Swapping with third Variable.

		String t;

		t = a;
		a = b;
		b = t;
		
        System.out.println("Swapping with Third Variable: ");
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);

		System.out.println("------------------------------------");

//------------------------------------------------------------------------------------------------------------------------------		

		// 2. Swapping without Third Variable.

		// Step-1 append a and b
		a = a + b; // HelloWorld
		System.out.println(a);

		// Step-2 Store initial string a in string b:
		b = a.substring(0, a.length() - b.length());

		// Step-3 Store initial string b in string a:
		a = a.substring(b.length());

		System.out.println("Swapping without Third Variable: ");
		System.out.println("Value of the of a and b after Swapping");
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);

	}

}