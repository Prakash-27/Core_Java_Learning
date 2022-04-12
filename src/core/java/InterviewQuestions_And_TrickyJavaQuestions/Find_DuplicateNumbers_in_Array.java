package core.java.InterviewQuestions_And_TrickyJavaQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Find_DuplicateNumbers_in_Array {

	public static void main(String[] args) {

		int number[] = {2,2,4,6,7,6,9,9};
			
		Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		for(Integer num : number) {
			if(intMap.put(num, num) != null) {
				System.out.println("Duplicate Using HashMap is: " + num);
			}
		}
		System.out.println(intMap);
		
		Set<String> intSet = new HashSet<String>();
		for (Integer num : number) {
			String numstr = Integer.toString(num);
			if (intSet.add(numstr) == false) {
				//System.out.println("Duplicate element is: " + numstr);
				System.out.println("Duplicate Number is: "+Integer.parseInt(numstr));
			}
		}
        System.out.println(intSet);
		
		
	}

}
