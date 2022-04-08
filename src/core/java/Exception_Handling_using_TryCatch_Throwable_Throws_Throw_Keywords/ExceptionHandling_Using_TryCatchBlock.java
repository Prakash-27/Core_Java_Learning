package core.java.Exception_Handling_using_TryCatch_Throwable_Throws_Throw_Keywords;

public class ExceptionHandling_Using_TryCatchBlock {

	int a = 10;
	
	public static void main(String[] args) {

		//1. 
		//uncaught exception:
		//This type of exception can be identified in Run Time Only Because we can't able to find this type of exception in the compile time.
		
		//int i = 9/0;
		//System.out.println(i); // It throws --> java.lang.ArithmeticException: / by zero
		
		
		//caught exception:
		//But this will give you the exception on the Compile time, then IDE gives you the two Suggestion. 
		//i) throws declaration  
		//ii) Surround with try/catch Block
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		//2.
		ExceptionHandling_Using_TryCatchBlock obj = new ExceptionHandling_Using_TryCatchBlock();
		obj = null; //Here we are breaked the link of obj reference of Object ExceptionHandling() by initializing null;
		
		//int a = 10; //This is local variable
	    //Because we created Object Method obj = null; so in object level we can't access this.
	    //So if we created any local variable like int a = 10; then we called it with respect to Object 'obj.a' it won't work at all. 
	    //Because we are initialized with null so it won't give to the 'a' value. instead of 'a' value it will throw java.lang.Error: Unresolved compilation problem: a cannot be resolved or is not a field 
		 
		
		//Here the 'a' value is declared in the Global Level on top we can see this
		//That why we initialized in Global Level.
		
		//System.out.println(obj.a); //This line will gives you the NullPointerException Cannot read field "a" because "obj" is null
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		//3. Try-Catch Block:
		
		try {
		    int i1 = 9/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		
	}

}
