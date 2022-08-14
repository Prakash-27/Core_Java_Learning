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
 * Member Inner Class:
 * -------------------
 * A non-Static class that is created inside a class but outside a method is called Member inner class.
 * 
 * @param args
 */

class memberOuter {

	private int data = 30;
	
	void Show() {
		
		System.out.println("data is " + data);
	}

	class memberInner {

		void msg(){

			System.out.println("data is "+ data); 
		}
	}

}	


public class Member_InnerClass {

	public static void main(String[] args) {

		memberOuter memberouter = new memberOuter();
		
		memberOuter.memberInner memberinner = memberouter.new memberInner();
		
		memberouter.Show();
		
		memberinner.msg();

	}

}