package com.java.LogicalOperator;

public class LogicalOperators {

	public static void main(String[] args) {

		char a1 = 'A'; // Decimal value of 'A' is 65
		char a2 = 65;
		int i1 = 5;
		int i2 = 10;

		// false && true = false;
		// false && false = false;
		boolean res1 = (i1 == i2) && (a1 == a2);
		boolean res2 = (i1 == i2) & (a1 == a2);
		System.out.println("res = " + res1);
		System.out.println("res = " + res2);

		// true || true = true
		// true || false = true
		// false || true = true
		boolean res3 = (a1 == a2) || (i1 == i2);
		boolean res4 = (a1 == a2) | (i1 == i2);
		System.out.println("res = " + res3);
		System.out.println("res = " + res4);

		// true ^ true = false
		// true ^ false = true
		// false ^ true = true
		// false ^ false = false
		boolean res5 = (a1 == a2) ^ (i1 == i2);
		boolean res6 = (a1 == a2) ^ (i1 != i2);
		System.out.println("res = " + res5);
		System.out.println("res = " + res6);
		
		//Ternary Operator
		
		int time = 11;
		String s = (time >= 12) ? "PM" : "AM";
	    //true means 2ndvar : PM //false means 3rdvar : AM
		System.out.println("s = " + s); 

	}

}
