package core.LAO.java.interview_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Reverse_StringExample {

	// 1.0 Reverse a String using string Buffer class using Return statement.
	public static StringBuffer reverseStringByStringBuffer(String given) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		StringBuffer reversed_String = buffer.reverse();
		return reversed_String;
	}

	// 1.1 Reverse a String using string Buffer class without Return statement.
	public static void reverseStringByStringBuffer2(String name) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(name);
		System.out.println(buffer.reverse());
	}

	// 2.1 Reverse a string using toCharArray Method
	public static void reverseStringusingtoCharArray(String given) {
		char[] characterArray = given.toCharArray();
		int len = characterArray.length;
		String reversed = "";

		for (int i = len - 1; i >= 0; i--) {
			reversed = reversed + characterArray[i];
		}
		System.out.println("Reverse a String using toCharArray: " + reversed);
	}

	// // 2.2 Reverse a string using toCharArray Method using return statement.
	public static String reverseStringusingtoCharArray2(String s) {
		char[] char_array = s.toCharArray();
		int len = char_array.length;
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + char_array[i];
		}
		return rev;
	}

	public static void reverseStringUsingCollectionsClass(String given) {
		char[] char_Array = given.toCharArray();

		List<Character> list = new ArrayList<Character>();

		for (Character character : char_Array) {
			list.add(character);
		}

		Collections.reverse(list);

		ListIterator<Character> iterator = list.listIterator();

		while (iterator.hasNext()) {
			// Here we have to remove println to print to achieve the Output in Single line.
			System.out.print(iterator.next());
		}

	}

	public static void main(String[] args) {

		System.out.println(reverseStringByStringBuffer("Automation Testing"));
		reverseStringByStringBuffer2("Appium Using Java");
		reverseStringusingtoCharArray("Reverse String");
		System.out.println(reverseStringusingtoCharArray2("Jenkins"));
		reverseStringUsingCollectionsClass("ArrayList");

	}

}