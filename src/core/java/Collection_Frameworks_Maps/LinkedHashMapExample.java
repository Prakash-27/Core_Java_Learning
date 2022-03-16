package core.java.Collection_Frameworks_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public void IplTeamsAndcaptains() {
		//The Order is Presereved, So we can Predict the retrieval order of the elements inserted.
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		linkedHashMap.put("CSK ", " MS Dhoni");
		linkedHashMap.put("RCB ", " Virat Kholi");
		linkedHashMap.put("MI ", " Rohit Sharma");

		//In LinkedHashMap Normal Key and null Key are same, the Duplicted Key can overrite the value.
		linkedHashMap.put(null, "Lionel Messi");
		linkedHashMap.put(null, "Christiana Ronaldo");

		//In LinkedHashMap Normal values and null values are same, but the values are not Overriten.
		linkedHashMap.put("KKR", null);
		linkedHashMap.put("DC", null);

		System.out.println("LinkedHashMap Ipl Teams Name and Captains Name: " + linkedHashMap);
		
        //HashMap
		//The Order is not Presereved as it uses Hashing, So we can't Predict the retrieval order of the elements inserted.
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("CSK ", " MS Dhoni");
		hashMap.put("RCB ", " Virat Kholi");
		hashMap.put("MI ", " Rohit Sharma");
		
		//In HashMap Normal Key and null Key are same, the Duplicted Key can overrite the value.
		hashMap.put(null, "Lionel Messi");
		hashMap.put(null, "Christiana Ronaldo");

		//In HashMap Normal values and null values are same, but the values are not Overriten.
		hashMap.put("KKR", null);
		hashMap.put("DC", null);

		System.out.println("HashMap Ipl Teams Name and Captains Name: " + hashMap);

	}

	public static void main(String[] args) {

		LinkedHashMapExample linkedHashMapExample = new LinkedHashMapExample();
		linkedHashMapExample.IplTeamsAndcaptains();

	}

}
