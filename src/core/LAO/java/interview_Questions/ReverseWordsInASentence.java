package core.LAO.java.interview_Questions;

/**
 * How to Reverse the words in a Sentence.
 * 
 * @author Prakash
 *
 */

public class ReverseWordsInASentence {

	public static void main(String[] args) {

		String given = "Hi How Are You Doing !";

		String reversed = "";

		String[] temp = given.split(" ");

		System.out.println("Length Of the given StringArray: " + temp.length);

		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);
		System.out.println(temp[3]);
		System.out.println(temp[4]);
		System.out.println(temp[5]);

		int len = temp.length - 1;

		for (int i = len; i >= 0; i--) {

			reversed = reversed + temp[i] + " ";
		}
		System.out.println(reversed);

	}

}