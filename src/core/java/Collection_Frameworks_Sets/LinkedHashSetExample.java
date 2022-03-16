package core.java.Collection_Frameworks_Sets;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	/**
	 * LinkedHashSet->Child class of HashSet
	 * DS-> Hash table + Linked List
	 * Insertion order is preserved
	 * Duplicates not allowed
	 */
	
	/**
	 * PONITS ABOUT LINKEDHASHSET: 
	 * =========================== 
	 * LINKEDHASHSET(I) is implementation class for SET(I).
	 * Duplicate values are NOT allowed. 
	 * Insertion order IS MAINTAINED.
	 * underlying DS is HASH TABLE + LINKED LIST
	 * can insert Heterogeneous Objects (If generic's are not used)
	 * NULL elements are allowed in HASHSET.
	 * Implements Serializable and Clonable Interfaces
	 * Data are stored based on HASHCODE, So Search is very effective.
	 * Fill Ratio or Load factor: 0.75 or 75% 
	 * Default capacity - 16
	 */

	public void linkedHashSetExample(){
		//Heterogeneous Object 
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add(1);
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("10");

		System.out.println("Insertion Order preserved Linked Hash Set :"+ linkedHashSet);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSetExample example= new LinkedHashSetExample();
		example.linkedHashSetExample();
	}

}