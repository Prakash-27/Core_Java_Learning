package core.java.CanWeOverrideAStaticMethod_In_ChildClass;

public class ParentClass_or_SuperClass {

	//Can We Override A Static Method In ChildClass --> No we can't override the static Method in child class
	
	// Method Hiding:
	//---------------
	// This line of code gives You warning why because the Memory Object of the Child Class House() Function is not stored in Child Class Object it is Stored in the Out of the Child class Object that is called has Java memory Object.
	//From there we are calling the value that why it is giving warning.
	
	public static void House() {
		System.out.println("Parent -- House");
	}

//	public void House() {
//		System.out.println("Parent -- House");
//	}

	public void Money() {
		System.out.println("Parent -- Money");
	}

	public void Property() {
		System.out.println("Parent -- Property");
	}

}
