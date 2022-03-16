package core.java.Exception_Handling;

public class SingleTryCatch_And_MultipleTryCatchExamples {

	public static void main(String[] args) {

		try {
			 int number1 = 0;
			 int number2 = 3;
			 int result = number2/number1;
			 System.out.println(result);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Don't divide a number by Zero.");
		}	
		
		try {
			 float number1 = 3;
			 float number2 = 4;
			 float result = number2/number1;
			 System.out.println(result);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Don't divide a number by Zero.");
		}	
		
		//Multi catch handling Exception.
		
		try {
			 int number1 = 0;
			 int number2 = 3;
			 int result = number2/number1;
			 System.out.println(result);
		}catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("Don't divide a number by Zero.");
		}
		catch (NullPointerException e) {
			System.out.println("This is due to Null Pointer Exception.");
		}
		catch (Exception e) {
			System.out.println("Exception can handle any type of exception because it is parent of all exceptions");
		}	
		
	}
}
