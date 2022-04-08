package core.java.Interview_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	//Hey there i'm using what'sapp do you are using there what'sapp.
	//there : 2
	//using : 2
	//what'sapp : 2
	
	public static void main(String[] args) {

		findDuplicateWords("Hey there i'm using what'sapp do you are using there what'sapp");
		findDuplicateWords("hi hi hi hi hi ");
		findDuplicateWords("100 100 488 488");
		
	}
	
	
	public static void findDuplicateWords(String inputString) {
		
		//split
		String[] words = inputString.split(" ");
		
		//create one hashMap:
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		//To check each word in given Array:
		for(String word : words) {
			
			//if word is Present
			if(wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
			}else {
				wordCount.put(word, 1);
			}
		}
		
		//extracting all the keys of maps - wordCount:
		Set<String> wordsInString = wordCount.keySet();
		
		//loop through all the words in wordCount:
		for (String word : wordsInString) {
			if(wordCount.get(word)>1) {
				System.out.println(word + " : " + wordCount.get(word));
			}
		}
		
	}

}
