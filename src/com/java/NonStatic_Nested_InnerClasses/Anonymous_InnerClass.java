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
 * Anonymous inner class: 
 * ====================== 
 * --> A class that have no name
 * is known as anonymous inner class in java. It should be used if you have to
 * override method of class or interface. Java Anonymous inner class can be
 * created by two ways:
 * 
 * --> Class (may be abstract or concrete).
 * 
 * --> Interface
 * 
 * @param args
 */

abstract class outer {

	abstract void eat();

}

class inner {

}

public class Anonymous_InnerClass {

	public static void main(String[] args) {

		outer o = new outer() {

			@Override
			void eat() {

				System.out.println("Nice Fruits");
			}
		};

		o.eat();

	}
}