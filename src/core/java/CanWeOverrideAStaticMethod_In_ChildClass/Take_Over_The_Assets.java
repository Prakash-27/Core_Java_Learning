package core.java.CanWeOverrideAStaticMethod_In_ChildClass;

public class Take_Over_The_Assets {

	public static void main(String[] args) {

		ChildClass_or_SubClass subClass = new ChildClass_or_SubClass();
		
		                  //Method Hiding:
		subClass.House(); // This line of code gives You warning why because the Memory Object of the Child Class House() Function is not stored in Child Class Object it is Stored in the Out of the Child class Object that is called has Java memory Object. From there we are calling the value that why it is giving warning. 
		subClass.Money();
		subClass.Property();
		
	}

}
