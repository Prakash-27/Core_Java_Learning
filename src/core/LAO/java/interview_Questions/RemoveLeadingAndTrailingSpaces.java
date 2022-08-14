package core.LAO.java.interview_Questions;

public class RemoveLeadingAndTrailingSpaces {

	/**
	 * Remove leading and trailing white spaces 
	 * 
	 * string = " Hello Boss !! ";
	 * 
	 * 1.Using trim 2.Using Strip (Java 11) 1.strip() 2.stripLeading()
	 * 3.stripTrailing()
	 * 
	 * 3.Using regex 1. ^[ \t]+|[ \t]+$ --> leading and trailing 2. ^[ \t]+ -->
	 * leading 3. [ \t]+$ --> trailing
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		String input = " Hello Boss ";

		System.out.println("Trim:" + input.trim());
		System.out.println("strip:" + input.strip());
		System.out.println("stripLeading:" + input.stripLeading());
		System.out.println("stripTrailing:" + input.stripTrailing());

		System.out.println(input.replaceAll("^[ \t]+|[ \t]+$", ""));
		System.out.println(input.replaceAll("^[ \t]", ""));
		System.out.println(input.replaceAll("[ \t]+$", ""));

	}

}