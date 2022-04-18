package core.java.Interview_Questions;

public class Check_If_Given_Number_Is_Numeric {
	
	//How to verify if the String Contains Only Digits. like --> this (1234) 
	
	public static boolean isEmpty(CharSequence cs) {
		return cs == null || cs.length() == 0;
	}
	
	public static boolean isNumeric(CharSequence cs) {
		if(isEmpty(cs)) {
			return false;
		}
		
		 int len = cs.length();
		 
		 for(int i = 0; i<len; i++) {
			 if( ! Character.isDigit(cs.charAt(i))) {
				 return false;
			 }
		 }
		 return true;
	}
	
	public static void main(String[] args) {

		System.out.println(isNumeric(null));
		System.out.println(isNumeric(""));
		System.out.println(isNumeric(" "));
		System.out.println(isNumeric("a"));
		System.out.println(isNumeric("1"));
		System.out.println(isNumeric("123"));
		System.out.println(isNumeric("12345600"));
		System.out.println(isNumeric("testing"));
		System.out.println(isNumeric("test123")); //This is a Alpha Numeric Value.
		System.out.println(isNumeric("123t"));
		System.out.println(isNumeric("2.4"));
		System.out.println(isNumeric("+123"));
		System.out.println(isNumeric("-123"));
		System.out.println(isNumeric("0"));
		
		System.out.println(isNumeric("\u0967\u0967\u0968"));//unicode is also gives number of digits so it is also true.
		System.out.println(isNumeric("1 1 1"));
		System.out.println(isNumeric("$"));
	}

}
