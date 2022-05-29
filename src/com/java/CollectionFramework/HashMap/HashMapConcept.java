package com.java.CollectionFramework.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

import com.java.CollectionFramework.ArrayList.Employee;

public class HashMapConcept {
	
	//MAP(I) --> HASHTABLE(C)
	//MAP(I) --> HASHMAP(C) --> LINKEDHASHMAP(C).
	//MAP(I) --> SORTEDMAP(I) --> NAVIGABLEMAP(I) --> TREEMAP(C).
	
	//Map<key,value> or Map<k,V> --> Map is a key and value pair format.
	//Hashmap is a class implements Map Interface
	//extends AbstractMap
	//it contains only unique elememts
	//stores the values - key - value pair
	//it may have one null key and multiple null values
	//it maintains no order
	//hashmap is non-synchronised -- not thread safe
	//concurrent modification exception -- Fail - Fast condition
	//Hashmap is used for MultiThreading 
	//To avoid Concurrent modification Exception (or) Fail-fast Condition in Hashmap we Use ConcurrentHashmap After JDK 1.6.
	
	//Map Methods:
	//1.put()
	//2.putAll()
	//3.get(key)
	//4.containskey(key)
	//5.remove(key)
	//6.keySet()
	//7.entrySet()
	
	//Some Example Senarios for Using Map Interface:
	//1.Error codes (1.2.1 : "fatal error")
	//2.Map of Zip codes
	//3.Map of managers and Employees
	//4.Test data storage
	//5.Configuration/env variables
	//6.Headers in Rest API
	
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "UFT");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		for(Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		//User defined HashMap:
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Ben", 18, "Omnitrickes");
		Employee e2 = new Employee("Thor", 27, "Hammer");
		Employee e3 = new Employee("Doctor Strange", 18, "Magical Power");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the hasmap:
		for(Entry<Integer, Employee> m : emp.entrySet()) {
			 Integer key = m.getKey();
			 Employee em = m.getValue();
			 System.out.println("Super Heros " + key + " Info: ");
			 System.out.println(em.name +" "+ em.age +" "+ em.dept);
		}
		
		
		
	}

}
