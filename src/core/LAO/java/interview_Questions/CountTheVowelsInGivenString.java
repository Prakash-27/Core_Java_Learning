package core.LAO.java.interview_Questions;

public class CountTheVowelsInGivenString {

	/**
	 * Find the number of Vowels in the given String.
	 * 
	 * input = "Automation Engineering";
	 * output: 11
	 * 
	 * vowels: a e i o u
	 * 
	 * Steps:
	 * 1.First lets assume the vowel count is 0
	 * 2.Change the string to a uniform case
	 * 3.take the length of the string
	 * 4.iterate the characters until the length of the string
	 * 5.inside the loop, check if the char is any of the vowel character. if so, increment, the count by 1.
	 * 6.repeat this until no characters are left.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {

		String input = "Automation Engineering";
		
		int VowelsCount = 0;

		input = input.toLowerCase();

		int len = input.length();

		for (int i = 0; i < len; i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				
				VowelsCount++;
			}
		}
		System.out.println("Your String has " + VowelsCount + " Vowels");

	}

}
