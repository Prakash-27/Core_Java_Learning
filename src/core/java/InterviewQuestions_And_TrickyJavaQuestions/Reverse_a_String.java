package core.java.InterviewQuestions_And_TrickyJavaQuestions;

public class Reverse_a_String {
	
	//Difference b/w String and StringBuffer:
	
	//String : It is immutable in nature so we don't have the dedicated in built reverse() method for String.
	
	//StringBuffer : It is mutable in nature so we have the dedicated in built reverse() method for StringBuffer.
	
	//Do we have reverse() function in String? ---> NO! we don't have reverse function in String.

	public static void main(String[] args) {

		// 1.using for loop

		String s = "Selenium Appium";
		String reverse = "";

		int len = s.length();

		// Reverse a String using for loop

		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}

		System.out.println("Reverse a String: " + reverse); // muippA muineleS

//----------------------------------------------------------------------------------------------------------------------------		
	
		//Printing this type of answer in console:  muineleS muippA
		
		String se = "Selenium";
		String a = "Appium";

		String rev_selenium = "";
		String rev_appium = "";

		int len_se = se.length();
		int len_a = a.length();

		for (int i = len_se - 1; i >= 0; i--) {
			for (int j = len_a - 1; j >= 0; j--) {

				rev_selenium = rev_selenium + se.charAt(i);
				rev_appium = rev_appium + a.charAt(j);

			}

		}
		System.out.println("Reverse a String: " + rev_selenium);
		System.out.println("Reverse a String: " + rev_appium);
		System.out.println("Reverse a String: " + rev_selenium + " " + rev_appium);
		
//------------------------------------------------------------------------------------------------------------------------------		
		
		String str = "Google Amazon";
		String[] ga = str.split(" ");
		

//------------------------------------------------------------------------------------------------------------------------------		

		// 2. reverse a string using StringBuffer class.

		String w = "WebDriverIO JavaScript";

		StringBuffer sb = new StringBuffer(w);
		StringBuffer sb_rev = sb.reverse();
		System.out.println("Reverse a String Using StringBuffer: " + sb_rev);

		// 3. reverse a string using StringBuilder class.

		String c = "Cypress";

		StringBuilder sbu = new StringBuilder(c);
		StringBuilder sbu_rev = sbu.reverse();
		System.out.println("Reverse a String Using StringBuilder: " + sbu_rev);

//------------------------------------------------------------------------------------------------------------------------------		
		
		System.out.println(reverse_String("Play Wright"));

	}
	
	public static String reverse_String(String s) {
		char[] char_array = s.toCharArray();
		int len = char_array.length;
		String rev = "";
		
		for(int i=len-1; i>=0; i--) {
			rev = rev + char_array[i];
		}
		return rev;
	}

}