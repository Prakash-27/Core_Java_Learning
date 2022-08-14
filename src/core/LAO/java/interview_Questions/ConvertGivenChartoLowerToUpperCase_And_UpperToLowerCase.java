package core.LAO.java.interview_Questions;

public class ConvertGivenChartoLowerToUpperCase_And_UpperToLowerCase {

	/**
	 * Convert UPPERCASE letters to LOWERCASE letters and LOWERCASE to UPPERCASE letters
	 * 
	 * 1st type: tolowercase() and toUppercase
	 * 2nd type: custom logic --> A to Z - 65 to 90 (UpperCase), a to z - 97 to 122 (LowerCase)
	 * ----------------------
	 * 1. input = "HAPPY REPUBLIC DAY !";
	 * 2. Convert it to charArray
	 * 3. Find the length of the char array
	 * 4. Iterate using a loop until the length 
	 * 5. inside loop, take each character and check if its ASCII value is in between 65(A) and 90(Z) 
	 * 6. if it is, add 32 to it. ASCII value -> a-z (97 to 122)
	 * 7. Then store it in the char[i]
	 * 8. After the loop, iterate and print the chars
	 * 
	 * @param args
	 */
	
	public static void converGivenCharsLowerToUpperAndUpperToLower(String input) {
		
		//String input = "HAPPY REPUBLIC DAY !";
		
		char[] charArray = input.toCharArray();
		
		for(int i=0; i<input.length(); i++) {
			if(charArray[i]>=65 && charArray[i]<=90) {
				charArray[i] = (char) (charArray[i]+32);
			}
			else if(charArray[i]>=97 && charArray[i]<=122) {
				charArray[i] = (char) (charArray[i]-32);
			}
		}
	 
		for(int i=0; i<charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {

		/*
		 * String input = "HAPPY REPUBLIC DAY !";
		 * 
		 * char[] charArray = input.toCharArray();
		 * 
		 * for(int i=0; i<input.length(); i++) { if(charArray[i]>=65 &&
		 * charArray[i]<=90) { charArray[i] = (char) (charArray[i]+32); } }
		 * 
		 * for(int i=0; i<charArray.length; i++) { System.out.print(charArray[i]); }
		 * 
		 * System.out.println();
		 * 
		 * String input1 = "happy independence day !";
		 * 
		 * char[] charArray1 = input1.toCharArray();
		 * 
		 * for(int i=0; i<input.length(); i++) { if(charArray1[i]>=97 &&
		 * charArray1[i]<=122) { charArray1[i] = (char) (charArray1[i]-32); } }
		 * 
		 * for(int i=0; i<charArray1.length; i++) { System.out.print(charArray1[i]); }
		 */
		
		converGivenCharsLowerToUpperAndUpperToLower("HAPPY REPUBLIC DAY !");
		converGivenCharsLowerToUpperAndUpperToLower("happy independence day !");
		
		
	}

}
