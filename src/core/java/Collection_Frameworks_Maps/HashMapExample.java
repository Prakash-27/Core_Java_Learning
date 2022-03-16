package core.java.Collection_Frameworks_Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void HashMap_OperableMethods_Examples() {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		//To insert an element PUT Method is used.
		hashMap.put(1, "Monday"); //ENTRY means Key-Value Pair is called ENTRY SET in HASHMAP.
		hashMap.put(2, "Tuesday");
		hashMap.put(3, "Wednesday");
		hashMap.put(4, "Thurday");
		hashMap.put(5, "Friday");
		hashMap.put(6, "Saturday");
		hashMap.put(7, "Sunday");
		System.out.println("Weeks Maps: " + hashMap);

		//To make a copy of the existing map.
		Map<Integer, String> duplicateHashMap = new HashMap<Integer, String>();
		duplicateHashMap.putAll(hashMap);
		System.out.println("Duplicate Map: " + duplicateHashMap);

		//To delete the Map contents
		duplicateHashMap.clear();
		System.out.println("After Clearing: " + duplicateHashMap);

		//To check if the key is present or Not in the Map.
		System.out.println("Does this Map has Key 1: " + hashMap.containsKey(1));

		//To check if the Value is present or Not in the Map.
		System.out.println("Does this Map has Value Sunday: " + hashMap.containsValue("Sunday"));

		//Clone the Map
		System.out.println("Cloned Map: " + hashMap.clone());

		//Check if the Map isEmpty or Not.
		System.out.println("Is Empty or Not?: " + hashMap.isEmpty());

		//Fetch the set of Keys in the Map (NOTE: Here it's not a List of Keys, it's Set of Keys.)
		//Because List will allow duplicate but Set won't. Keys Should be Unique.
		System.out.println("Key Set: " + hashMap.keySet());

		//Fetch a Value
		System.out.println(hashMap.get(4));

		//Fetch all the Values
		System.out.println("All Values: " + hashMap.values());

		//Entry Set
		System.out.println(hashMap.entrySet());

		//Replace the Value and Key.
		hashMap.replace(7, "Funday");
		System.out.println("Replacing Sunday to Funday: " + hashMap);

		//Remove the value in Map.
		hashMap.remove(6, "Saturday");
		System.out.println("Remove the Saturday using Key-Value Pair in Map: " + hashMap); 

		//HashMap
		//The Order is not Presereved as it uses Hashing, So we can't Predict the retrieval order of the elements inserted.
		HashMap<String, String> hashMap2 = new HashMap<String, String>();
		hashMap2.put("CSK ", " MS Dhoni");
		hashMap2.put("RCB ", " Virat Kholi");
		hashMap2.put("MI ", " Rohit Sharma");

		//In HashMap Normal Key and null Key are same, the Duplicted Key can overrite the value.
		hashMap2.put(null, "Lionel Messi");
		hashMap2.put(null, "Christiana Ronaldo");

		//In HashMap Normal values and null values are same, but the values are not Overriten.
		hashMap2.put("KKR", null);
		hashMap2.put("DC", null);

		System.out.println("HashMap Ipl Teams Name and Captains Name: " + hashMap2);

	}

	public static void main(String[] args) {

		HashMap_OperableMethods_Examples();

	}

}
