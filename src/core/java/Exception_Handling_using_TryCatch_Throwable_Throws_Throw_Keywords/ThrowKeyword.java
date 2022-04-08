package core.java.Exception_Handling_using_TryCatch_Throwable_Throws_Throw_Keywords;

public class ThrowKeyword {

//	public static void main(String[] args) throws Exception {
//
//		// 1.Throws Declaration Method --> this throws Exception on the besides of the main method.
//		 
//		System.out.println("ABCD");
//
//		 throw new Exception("Simple Exception"); //Here I'm Deliberately throw the
//		// exception so it won't catch the exception that will terminate the console
//		// before execution of other code below.
//
//		 System.out.println("PQRS"); //here the above exception is not catched so that
//		// this line gives error like: Unreachable code
//	}

//--------------------------------------------------------------------------------------------------------------------------------

	// 2.Using try-catch block method
	public static void main(String[] args) {

		System.out.println("ABCD");

		try {
			throw new Exception("Simple Exception"); // using try-catch Block to resolve the Exception is the Best Approached way. 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("PQRS");
				
		
		String Exec_Flag = " ";
		if(Exec_Flag.equals(" ")) {
			try {
				throw new Exception("Exec Flag is a Blank Exception"); 
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Test"); 
		
	}
	
	
//------------------------------------------------------------------------------------------------------------------------------
	
	
//	public static void main(String[] args) throws Exception {
//
//		String Exec_Flag1 = " ";
//		if (Exec_Flag1.equals(" ")) {
//			
//			throw new Exception("Exec Flag1 is a Blank Exception");
//		}
//		
//		System.out.println("Test1"); //This line is not printing in the console. 
//		//why because the 'throw new Exception("Exec Flag1 is a Blank Exception")' is only throws not it has been catched. 
//		//So thats why the System.out.println("Test1"); line is not printed in console.
//		
//	}

}