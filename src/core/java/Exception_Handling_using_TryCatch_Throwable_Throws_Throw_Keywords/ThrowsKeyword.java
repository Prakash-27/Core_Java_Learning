package core.java.Exception_Handling_using_TryCatch_Throwable_Throws_Throw_Keywords;

public class ThrowsKeyword {

//	public static void main(String[] args) throws ArithmeticException { 
//		//here no one is catching the exception all the sub and main methods are throwing the exception then who is going to catch the exception JVM will catch the exception automatically.
//		//even though it will terminate the program and not going to execute below line of code.
//		//But this is not the Right way to catch the exception. 
//
//		ThrowsKeyword obj = new ThrowsKeyword();
//		obj.Sum(); //this is calling Sum Method
//		
//	}
	
	
	public static void main(String[] args) { 
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.Sum(); //this is calling Sum Method
		System.out.println("ABCD");
	}
	
	
	

//	public void Sum() throws ArithmeticException { // here sum method is called div method
//		div();
//	}
	
	public void Sum() { //This is the write way to catch the exception while using throws Keyword.
	try {	
		div();
	}
	catch(ArithmeticException e) {
		
	}
  }
	
//	public void div() throws ArithmeticException {  //here div method having the exception to throw 
//		int i = 9/0; //exception line.
//	}
	
	public void div() throws ArithmeticException {  
		int i = 9/0; //exception line.
	}
	
	
}
