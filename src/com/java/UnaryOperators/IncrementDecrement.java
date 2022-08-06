package com.java.UnaryOperators;

public class IncrementDecrement {

	public static void main(String[] args) {

		int i = 10, j = 5;
		i++; //same as i = (int) (i + 1);
		--j; //same as j = (int) (j - 1);
		System.out.println("i = " + i); //i = 11
		System.out.println("j = " + j); //j = 4
		
		//i = 11, j = 4
		int res = i++ + --j;
		//Step 1: res = 11 + --j and i = 12, j = 4
		//Step 2: res = 11 + 3 and i = 12, j = 3
		
		System.out.println("res = " + res); //res = 14
		System.out.println("i = " + i); //i = 12
		System.out.println("j = " + j); //j = 3
		
		
	}

}
