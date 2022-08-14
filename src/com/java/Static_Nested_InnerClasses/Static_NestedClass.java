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
 * Nested Class:
   -------------
   --> A static class i.e. created inside a class is called static nested class in java. It cannot access non-static data members and methods. It can be accessed by outer class name.

   --> It can access static data members of outer class including private.

   --> Static nested class cannot access non-static (instance) data member or method.
 * 
 * @author Prakash
 */

class StaticOuter {

	static int data = 30;

	static class StaticInner{

		void msg() {

			System.out.println("data is " + data);
		}
	}
}

public class Static_NestedClass {

	public static void main(String[] args) {

		StaticOuter.StaticInner inner = new StaticOuter.StaticInner();
		
		inner.msg();
		
	}

}