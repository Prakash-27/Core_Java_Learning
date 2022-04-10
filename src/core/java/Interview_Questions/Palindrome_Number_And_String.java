package core.java.Interview_Questions;

import java.util.Scanner;

public class Palindrome_Number_And_String {

	// 1. Find the Integer PalindromeNumber:

	// 151 454 34543 78987
	public static void isPalindromeNumber(int num) {
		System.out.println("Given Number is " + num);

		int r = 0;
		int sum = 0;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10; // get the remainder.
			sum = (sum * 10) + r;
			num = num / 10;
		}

		if (t == sum) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not a Palindrome number");
		}
	}

//-----------------------------------------------------------------------------------------------------------------------------	

	// 2.0 Find the PalindromeString Using for Loop:
	public static void isPalindromeString(String name) {
		System.out.println("Given String is a " + name);

		String rev = "";
		int len = name.length();

		String t = null;

		t = rev;

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}

		System.out.println("The reverse of the name: " + rev);

		if (rev.equals(name)) {
			System.out.println("is a Palindrome String");
		} else
			System.out.println("is not a Palindrome String");

	}

//------------------------------------------------------------------------------------------------------------------------------	

	// 2.1 Find the PalindromeString Using StringBuffer Class :

	public static void StringRev(String string) {
		String t;
		t = string;

		StringBuffer reversestring = new StringBuffer(String.valueOf(string)).reverse();

		// StringBuffer reversestring = new StringBuffer(string).reverse().toString();

		System.out.println(reversestring);

		if (t.contentEquals(reversestring)) {
			System.out.println("It is a Palindrome String");
		} else {
			System.out.println("It is NOT a Palindrome String");
		}
	}

//-----------------------------------------------------------------------------------------------------------------------------

	// 3.
	public static int[] checkPalindrome(Object x) {

		int flag = 0;

		int a[] = new int[2];

		String str = String.valueOf(x);

		int len = str.length();

		if (len % 2 == 0) {

			for (int i = 0; i < (len / 2); i++) {

				if (str.toUpperCase().charAt(i) == str.toUpperCase().charAt(len - i - 1)) {

					flag++;
				}
			}
		}

		else {

			for (int i = 0; i < (int) (len / 2); i++) {

				if (str.toUpperCase().charAt(i) == str.toUpperCase().charAt(len - i - 1)) {

					flag++;
				}
			}

		}

		a[0] = len;
		a[1] = flag;

		return a;
	}

	
	public static void main(String[] args) {

		isPalindromeNumber(151);
		isPalindromeNumber(152);
		isPalindromeNumber(78987);
		isPalindromeNumber(111);
		isPalindromeNumber(1110);

		System.out.println("--------------------------");

		isPalindromeString("MADAM");
		isPalindromeString("WOW");

		System.out.println("--------------------------");

		StringRev("teet");
		StringRev("DAD");
		StringRev("MOM");

		System.out.println("--------------------------");

		//3.
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER SOMETHING");

		Object x = sc.nextLine();

		System.out.println(x);

		int[] b = checkPalindrome(x);

		if (b[1] == (int) (b[0] / 2)) {
			System.out.println(x + " IS A PALINDROME");
		}
		else {
			System.out.println(x + " IS NOT A PALINDROME");
		}
	}
}