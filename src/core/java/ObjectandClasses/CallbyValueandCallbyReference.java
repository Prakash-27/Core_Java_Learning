package core.java.ObjectandClasses;

public class CallbyValueandCallbyReference {

	int P;//This are Global Variables.But we can access Global variable throughout entire Program. 
	int Q;
	
	public static void main(String[] args) {

		// this is (i.e new CallbyValueandCallbyReference()) called Object.
		CallbyValueandCallbyReference callByValue = new CallbyValueandCallbyReference();
		
		int x = 40;//This are Local Variable.we can access it only in this main method. 
		int y = 30;
		
		//Call By Value (or) Pass By Value:
		//call By value is Passing the exact copy value of (x,y) to the parameterized Arguments. 
		int call_By_Value_Object = callByValue.TestSum(x, y);
		System.out.println("CALL BY VALUE:");
		System.out.println("==============");
		System.out.println("TestSum Value is: "+call_By_Value_Object);
		
		System.out.println("---------------------------------");
		
		CallbyValueandCallbyReference callByReference = new CallbyValueandCallbyReference();
		
		callByReference.P = 50;//we can call Global Variable by Class reference object (or) we can call it by Static.
		callByReference.Q = 60;
		
		//call by Reference (or) Pass By Reference.
		//call by Reference is Passing the Reference Object of the current class to parameter Argument of Swap Method.
		callByReference.swap(callByReference);
		System.out.println("CALL BY REFERENCE:");
		System.out.println("==================");
		System.out.println("After Swapping P value is: "+callByReference.P);
		System.out.println("After Swapping Q value is: "+callByReference.Q);
		
	}

	//call By value is Passing the exact copy value of (a,b) to the parameterized Arguments. 
	public int TestSum(int a, int b) {
		//Here if we are not giving value for the arguments means, while calling the Method on Main function we can assign our own value.
		//But we have been given the values here it self means it will consider this values for execution.
        //callByValue.TestSum(0, 0);
		
		//a = 10;
	    //b = 20;
		int c = a+b;//This is also a Local Variable.we can access it only in our customized method. 
		return c;
	}
	
	//call by Reference is Passing the Reference Object of the current class to parameter Argument of Swap Method.
	public void swap(CallbyValueandCallbyReference Reference) {
		int temp;//temp = 50;
		temp = Reference.P;//Reference.P = 60;
		Reference.P = Reference.Q;//Reference.Q = 50;
		Reference.Q = temp;
	}
	
}
