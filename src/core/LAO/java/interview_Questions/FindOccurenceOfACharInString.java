package core.LAO.java.interview_Questions;

public class FindOccurenceOfACharInString {

	/**
	 * Find the Occurrence of a Character in a String.
	 * 
	 * input = "Alphabet" toFind = 'a' Occurrence = 3
	 * 
	 * 1st Method: Using Iteration.
	 * 
	 * 2nd Method:
	 * Step for the Code: 
	 *  S1: Convert the inputs to a Lowercase format 
	 *  S2: Find the length of the actual input 
	 *  S3: Replace the tofind char with Empty String 
	 *  S4: Find the length after Replacing
	 *  S5: Occurrence = actual length - length after replacing
	 * 
	 * @param args
	 */
	
	 String input = "Alphabet";
     char toFind = 'a';
	
    //1st Method: with Iteration
	public void withIterationType() {
		input = "Alphabet";
		toFind = 'a';
		int occurrence = 0;

		input = input.toLowerCase();
		int len = input.length();

		for (int i = 0; i < len; i++) {
			if (input.charAt(i) == toFind) {
				occurrence = occurrence + 1;
			}
		}
		System.out.println("toFind: " + toFind + " is present in the given input String");
		System.out.println("Occurrence: a is occurs in " + occurrence + " no of times in the given input String");
		System.out.println("-----------------------------------------------------------------------------------");
	}
	
	//2nd Method: without Iteration
	public void withoutIterationType() {
		input = "Alphabet";
		toFind = 'a';
		
		input = input.toUpperCase();
		
		int actualLength = input.length();
		 
		System.out.println("Actual Length--> " + actualLength);
		
		String charToFind = Character.toString(toFind).toUpperCase();
		
		input = input.replace(charToFind, "");
		
		int lengthAfterReplacing_CharToNoSpace = input.length();
		
		int ReplacedLengthAfter_CharToNoSpace = actualLength - lengthAfterReplacing_CharToNoSpace;
		
		System.out.println("lengthAfterReplacing_CharToSpace--> " + lengthAfterReplacing_CharToNoSpace);
		System.out.println("ReplacedLengthAfter_CharToNoSpace--> " + ReplacedLengthAfter_CharToNoSpace);
		
	}

	public static void main(String[] args) {
		FindOccurenceOfACharInString charInString = new FindOccurenceOfACharInString();
		charInString.withIterationType();
		charInString.withoutIterationType();
	}

}