package core.java.InterviewQuestions_And_TrickyJavaQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Find_DuplicateElements_in_Array {

	public static void main(String[] args) {

		String names[] = { "Java", "JavaScript", "C", "Python", "Ruby", "PHP", "C", "Java", "Python" };

		// 1. compare each elements(one to one Mapping): O(nxn) --- worst Solution
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {
					System.out.println("Duplicate elements is:: " + names[i]);
				}
			}
		}

		System.out.println("--------------------------------------------------");
		
//------------------------------------------------------------------------------------------------------------------------------		

		// 2. Using HashSet: Java Collection: it Stores Unique Value it won't allow : O(n)
		// Duplicate values: O(n)
		Set<String> storeSet = new HashSet<String>();
		for (String name : names) {
			if (storeSet.add(name) == false) {
				System.out.println("Duplicate element is: " + name);
			}
		}
        System.out.println(storeSet);
		
		System.out.println("--------------------------------------------------");
		
//-------------------------------------------------------------------------------------------------------------------------------

		// 3. Using HashMap.
		Map<String, Integer> storeMap = new HashMap<String, Integer>();

		for (String name : names) {
			Integer count = storeMap.get(name); // It will return null as no value are present for the Key.
			if (count == null) {
				storeMap.put(name, 1); // When its null add the value
			} else {
				storeMap.put(name, ++count); // when it find occurrence of java (i.e count = 1) we increase the count.
			}
		}
		
		System.out.println(storeMap);
		
		// get the value from this Map

				Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
				for(Entry<String, Integer> entry : entrySet) {
					if(entry.getValue()>1) {
						System.out.println("Duplicate elements is: " + entry.getKey());
						System.out.println("The Occurence of element: " + entry.getKey() +" is "+ entry.getValue());
					}
				}
		
//		for (String name : names) {
//			Integer count = storeMap.get(name); // It will return null as no value are present for the Key.
//			if (storeMap.get(name) == null) {
//				storeMap.put(name, count); // When its null add the value
//			} else {
//				System.out.println("Print Duplicate element: " + name); // when it find occurrence of java (i.e count = 1) we increase the count.
//			}
		
//------------------------------------------------------------------------------------------------------------------------------		
		
		//This code is for  difference b/w ++i(pre-increment) and i++(post-increment).
		
//		int arr[] = {2, 5, 6, 9, 4};
//		for(int i = 0; i < arr.length; ++i) {
//			System.out.println(arr[i]+" ");
//		}
		
//		int a = 1;
//		System.out.println(a++);
//		int b = 1;
//		System.out.println(++b);
		
	}
}