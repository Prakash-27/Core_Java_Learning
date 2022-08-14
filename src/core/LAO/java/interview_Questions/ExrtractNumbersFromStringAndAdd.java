package core.LAO.java.interview_Questions;

public class ExrtractNumbersFromStringAndAdd {
	
	/**
	 * Extract numbers from a string and add them
	 * 
	 * input = "17AlbertEienstein1704";
	 * output= 12
	 * 
	 * Steps:
	 * 1.Assume the total of the digits=0
	 * 2.take the length of the string and iterate
	 * 3.inside the loop, fetch each char value and store
	 * 4.check if that char is a digit or not, using isDigit()
	 * 5.if it is a digit, get the numeric value and add it to total = total + numericValue;
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		String input = "17AlbertEienstein04";
		
		int total = 0;
		
		int len = input.length();
		
		for(int i=0; i<len; i++) {
			
			char character = input.charAt(i);
			
			if(Character.isDigit(character)) {
				
				total = total + Character.getNumericValue(character);
			}
		}
		System.out.println(total);
		
	}
}