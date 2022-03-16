package core.java.Collection_Frameworks_Maps;

import java.util.TreeMap;

public class TreeMapExample {
	
	public static void Some_Districts_In_TamilNadu() {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		//TreeMap will give Natural Sorting Order. 
		//Because it will implements Comparable interface which mean it will compare the Districts and null so it not able to compare.
		//It will not run even though the single line of program treeMap.put(null, "Districts"); is there.
		//It will Throw NullPointer Exception.
		//treeMap.put(null, "Districts");
		treeMap.put("Erode", "Districts");
		treeMap.put("Chennai", "Districts");
		treeMap.put("ThiruvanaMalai", "Districts");
		treeMap.put("Kanchipuram", "Districts");
		treeMap.put("VilluPuram", "Districts");
		treeMap.put("Districts", null);
		
		//If we try to add or put Duplicate Key it will Overrite the Given value.
		treeMap.put("Districts", "Coimbatore");
		treeMap.put("Districts", "Vellore");
		
		
		
		System.out.println("Some District's in TamilNadu: " + treeMap);
	}
	
	public static void main(String[] args) {

		Some_Districts_In_TamilNadu();
		
	}

}
