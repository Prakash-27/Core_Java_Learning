package core.java.ConstructorTypes;

public class DefaultConstructor {
	
	String student_name = "John Smith"; 
	int roll_no = 10;
	
	
	//Example for default Constructor.
	
	 /* Do you see any constructors here? Nope! Then you have no Special powers.
	    Compiler has created one here!!! Believe me!!!*/
	 
	public static void main(String[] args) {
		                                     // this function is created automatically in class we can't see in naked eye.
		DefaultConstructor constructor = new DefaultConstructor();
		
		System.out.println(constructor.student_name);
		System.out.println(constructor.roll_no);
		
		

	}

}
