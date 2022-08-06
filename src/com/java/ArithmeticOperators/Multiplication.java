package com.java.ArithmeticOperators;

public class Multiplication {

	public static void main(String[] args) {

		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		
		int res1 = i1 * i2; 
		float res2 = i1 * f1;
		double res3 = i2 * d1;
		
		System.out.println("res1 = " + res1); //50
		System.out.println("res2 = " + res2); //77.5
		System.out.println("res3 = " + res3); //205.0
		
		byte b1 = 20; 
		byte b2 = 2;
		
		byte res4 = (byte) (b1 * b2);
		System.out.println("res4 = " + res4); //40
		
		//int range : -2147483648 to 2147483647
		
		 i1 = 1000000; //Re-assignment
		 i2 = 5000; //Re-assignment
		res1 = i1 * i2; //Result is out of int range , but compiler tries to fit the value
		//However,int can only hold 32 bit data, therefore first 4 bytes (32 bits) are ignored and resultant number is 705032704 decimal.
		
	}

}
