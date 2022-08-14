package core.LAO.java.interview_Questions;

public class LengthOfAString {

	/**
	 * Find the length of the String without using length Method.
	 * 
	 * @param args
	 */

	public void findLengthOfString() {

		String string = "ChickenPakoda";

		int len = string.length();
		System.out.println("Using String Length Method: " + len);

		char[] charArray = string.toCharArray();

		int length = 0;

		for (char c : charArray) {
			length++;
		}
		System.out.println("Without Using String Method and toCharArray Method: " + length);

	}

	public static void main(String[] args) {

		LengthOfAString lengthOfAString = new LengthOfAString();
		lengthOfAString.findLengthOfString();

	}

}
