package com.java.Collection_Framework_Hash_Table;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	//Hash code Number is 32 bit Integer value --> 3434354
	//It is Similar to Hashmap, but its is Synchronized. and Thread safe.
	//Key---> Object--HashCode---> value
	
	//Synchronized --> One thread (h1 or st) can access the Object at a Time is called Synchronized. 
	//Non-Synchronized --> All the thread (h1,h2,st,st1) can access or Attack the One Object at the Same Time Non-Synchronized.
	
	public static void main(String[] args) {

		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "Jerry");
		h1.put(2, "Know");
		h1.put(3, "Java");
		
		//create a clone copy/shallow copy:
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2 = (Hashtable) h1.clone();
		
		System.out.println("The values from h1 " + h1);
		System.out.println("The values from h2 " + h2);
		
		h1.clear();
		System.out.println("The values from h1 " + h1);
		System.out.println("The values from h2 " + h2);
		
		//Contains Value:
		Hashtable<String, String> st = new Hashtable<String, String>();
		st.put("A", "Prakash");
		st.put("B", "Automation Engineer");
		st.put("C", "Selenium");
		
		if(st.containsValue("Prakash")) {
			System.out.println("value is found");
			
			//print all the values from hashtable using -- Enumeration -- elements()
			 Enumeration e = st.elements();
			System.out.println("print values from st");
			System.out.println(e);
			
			while(e.hasMoreElements()) {
				System.out.println(e.nextElement());
			}
		}
		
		//get all the values from hashtable usisng -- entrySet() -- set of hashtable
		System.out.println("print values from st using entry set");
		
		Set s = st.entrySet();
		System.out.println(s);
		
		Hashtable<String, String> st1 = new Hashtable<String, String>();
		st1.put("A", "Prakash");
		st1.put("B", "Automation Engineer");
		st1.put("C", "Selenium");
		
		
		//check both the hastables are equal or not:
		if(st.equals(st1)) {
			System.out.println("Both are equals");
		}
		
		//get the value from a key:
		System.out.println(st1.get("A"));
		System.out.println(st1.get("B"));
		System.out.println(st1.get("C"));
		
		//get the hashcode of hashtable Object:
		System.out.println("The hash code value of st1 : " + st1.hashCode());
		
		
	}
}