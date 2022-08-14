package core.LAO.java.interview_Questions;

public class ReplaceVowelsWithDollars {

	/**
	 * Replace Vowels with a special character.
	 * 
	 * Replace all vowels with *
	 * 1.input = "I Miss Mahendra Singh Dhoni."
	 * 2.Convert the length of the String and iterate
	 * 3.calculate the length of the string and iterate
	 * 4.inside the loop, check if the charAt (index) = vowels
	 * 5.if its a vowel characters, assign it with *
	 * 6.outside the loop iterate again to print the char array
	 * 
	 * Another approach: Using regular Expression
	 * 1.use replaceAll function for the regex "[AEIOUaeiou]" and replace it with *. 
	 * 
	 * CAUTION: if u are replacing it with $, make sure \\ is used --> \\$
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		String givenText = "I Miss Mahendra Singh Dhoni.";

		//1st Method:
		char[] charArray = givenText.toCharArray();

		for (int i = 0; i < givenText.length(); i++) {

			if (givenText.charAt(i) == 'A' || givenText.charAt(i) == 'E' || givenText.charAt(i) == 'I'
					|| givenText.charAt(i) == 'O' || givenText.charAt(i) == 'U' || givenText.charAt(i) == 'a'
					|| givenText.charAt(i) == 'e' || givenText.charAt(i) == 'i' || givenText.charAt(i) == 'o'
					|| givenText.charAt(i) == 'u')

				charArray[i] = '$';
		}

		for (int i = 0; i < givenText.length(); i++) {
			System.out.print(charArray[i]);
		}

		System.out.println("");
		
		//2nd Method:
		String replacedText = givenText.replaceAll("[AEIOUaeiou]", "\\$");
		System.out.println(replacedText);
		
		
	}

}