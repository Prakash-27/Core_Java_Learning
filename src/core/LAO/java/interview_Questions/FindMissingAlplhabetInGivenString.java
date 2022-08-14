package core.LAO.java.interview_Questions;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlplhabetInGivenString {
	
	/**
	 * Find the missing alphabet in the given String
	 * 
	 * 1.Pangram -> if a given statement is having all the English alphabets.
	 * 
	 * input = "a";
	 * Missing alphabet: b to z
	 * 
	 * Steps:
	 * ------
	 * 1.Convert the string to a uniform case (lower/upper)
	 * 2.Remove the space if there's any
	 * 3.Store the input into a String array
	 * 4.Create a string array with English alphabets
	 * 5.Create two Hashsets, one with user input and other with alphabets.
	 * 6.Compare the two sets and find the missing characters.
	 * 
	 * a -> [a]
	 * abcdefghijklmnopqrstuvwxyz -> [a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z]
	 * 
	 * @param args
	 */
	
	public static void missingAlphabetsInGivenString(String given) {
		
		//String given = "a";
		
		given = given.toLowerCase();
		
		given = given.replaceAll(" ", ""); 
		
		String[] userArray = given.split("");
		
		System.out.println(given);
		
		String[] alphabets = "abcdefghijklmnopqrstuvwxyz".split("");
		
//		HashSet<String> set = new HashSet<String>();
//		for(String s : userArray) {
//			set.add(s);
//		}
//		-------------Above type and Below Type are Same, Below type is Alter One of Above But both types are valid -------------------
		
		HashSet<String> set = new HashSet<String>(Arrays.asList(userArray));
		
		HashSet<String> set1 = new HashSet<String>(Arrays.asList(alphabets));
		set1.removeAll(set);
		
		System.out.println(set1);
		
	}
	
	public static void main(String[] args) {

		missingAlphabetsInGivenString("a");
		missingAlphabetsInGivenString("abcdef");
		missingAlphabetsInGivenString("ewhgqbj");
		
		
	}

}