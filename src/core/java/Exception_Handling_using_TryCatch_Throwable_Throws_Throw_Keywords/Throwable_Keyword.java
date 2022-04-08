package core.java.Exception_Handling_using_TryCatch_Throwable_Throws_Throw_Keywords;

public class Throwable_Keyword {

//	                                         Object --> This is the Super Class for all the One, and also for the Throwable.           
//	                                           |
//	                                           \/
//                                          Throwable --> This is the Super Class for the Error and Exception.
//                                             | 	
//                                  -------------------------         	
//                                  |                       |
//	                              Error                  Exception 
//                                                          |
//                                            -------------------------------            	
//                                            |                             |
//                              java.lang.all type of Exceptions   All type of Selenium Exceptions  
	
	
	public static void main(String[] args) {

		try {
		    //int i1 = 9/0;
		}catch(Error e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		
		
		try {
		    int i1 = 9/0;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		
		
		try {
		    int i1 = 9/0;
		}catch(Throwable e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		System.out.println("Above code is having 'ArithmeticException'");
		
		
//		try {
//		    int i1 = 9/0; 
//		}catch(Object e) {
//			((Throwable) e).printStackTrace();
//			System.out.println(((Throwable) e).getMessage());
//			System.out.println(((Throwable) e).getLocalizedMessage());
//		}
//		
//		System.out.println("Above code is having 'ArithmeticException'");
//		System.out.println("Above code is having 'ArithmeticException'");
//		System.out.println("Above code is having 'ArithmeticException'");
//		System.out.println("Above code is having 'ArithmeticException'");
//		System.out.println("Above code is having 'ArithmeticException'");
		
	}

}
