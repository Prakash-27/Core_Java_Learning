package com.java.Static_Nested_InnerClasses;

/**
 * 
 * Inner Class:
   ============
   --> Java inner class or nested class is a class which is declared inside the class or interface.
       ----------------
   --> We use inner classes to logically group classes and interfaces in one place so that it can be more readable and maintainable.

   --> Additionally, it can access all the members of outer class including private data members and methods.

   Advantages:
   ===========
   --> Nested classes represent a special type of relationship that is it can access all the members (data members and methods) of outer class including private.
                                                                       ------------------------------------------------------------------------------------------
   --> Nested classes are used to develop more readable and maintainable code because it logically group classes and interfaces in one place only.
                               ----------------------------------------------
   --> Code Optimization: it require less code to write.
 *  
 */

/**
 * Nested Interface:
   -----------------
   --> An Interface i.e declared within another interface or class is known as nested Interface.

   --> The nested interfaces are used to group related interfaces so that they can be easy to maintain.

   --> The nested interface must be referred by the outer interface or class. It can't be accessed directly.

   Points to remember:
   -------------------
   --> Nested interface must be public if it is declared inside the interface but it can have any access modifier if declared within the class.

   --> Nested interfaces are declared static implicitly.
 * 
 * @author Prakash
 */

interface Showable {

	void show();

	interface Message {

		void msg();

	}

}

//To call outer Interface
class TestNestedInterface implements Showable {

	@Override
	public void show() {

		System.out.println("Hello Nested Outer Interface");
	}
	
}

//To call Inner Interface
class TestNestedInterface1 implements Showable.Message {

	@Override
	public void msg() {

		System.out.println("Hello nested Inner interface");
	}
	
}


public interface Static_NestedInterface {
	
	public static void main(String[] args) {
		
		TestNestedInterface testNestedInterface = new TestNestedInterface();
		
		testNestedInterface.show();
		
        TestNestedInterface1 testNestedInterface1 = new TestNestedInterface1();
		
		testNestedInterface1.msg();
		
//-------------------------------------------------------------------------------------------------------------------		
		
		Showable message = new TestNestedInterface(); //upcasting here
		
		message.show();
		
		Showable.Message message1 = new TestNestedInterface1(); //upcasting here
		
		message1.msg();
		
	}

}
