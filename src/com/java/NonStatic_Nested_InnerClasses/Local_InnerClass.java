package com.java.NonStatic_Nested_InnerClasses;

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
 * Local inner Class:
 * ==================
 * --> A class i.e created inside a display() method is called LocalInner class in java. 
 * --> If you want to invoke the methods of local inner class, you must instantiate this class (LocalInner localInner = new LocalInner();) inside the display() method.
 * @author Prakash
 *
 */

class LocalOuter {

	private int data = 30; //instance variable 

	void display() {

		class LocalInner {

			void msg() {

				System.out.println("Data is: " + data);
			}
		}
		
		LocalInner localInner = new LocalInner();

		localInner.msg();
		
	}
	
}


public class Local_InnerClass {

	public static void main(String[] args) {

		LocalOuter localOuter = new LocalOuter();
		
		localOuter.display();
	}

}