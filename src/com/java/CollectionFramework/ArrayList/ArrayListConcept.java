package com.java.CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	// static array -- size is fixed.

	int a[] = new int[3];

	// Dynamic array -- ArrayList:
	// 1.can contain duplicate values/elements
	// 2.maintains insertion order
	// 3.Synchronized
	// 4.allows random access to fetch the element because it stores the values on
	// the basis of indexes

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add(10);// 0
		ar.add(20);// 1
		ar.add(30);// 2

		System.out.println(ar.size());

		ar.add(40);// 3
		ar.add(50);// 4
		ar.add(50);// 5

		ar.add(12.33);
		ar.add("Test");
		ar.add('a');
		ar.add(true);

		System.out.println(ar.size()); // size of arraylist

		System.out.println(ar.get(4)); // to get the value from an index

		// to print all the values from arraylist:
		// 1.for loop
		// 2.using iterator

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// non generic vs generic:

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		// ar1.add("Selenium");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("test");
		ar2.add("Selenium");

		// ArrayList<E> ar3 = new ArrayList<E>();

		System.out.println("*******************************");

		// User Defined class Object:
		Employee e1 = new Employee("Prakash", 22, "QA");
		Employee e2 = new Employee("Mark", 26, "Test Analyst");
		Employee e3 = new Employee("Sarah", 29, "Team Lead");

		// create arrayList:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		// iterator to traverse the values:
		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		System.out.println("*******************************");

		//addAll():
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Test");
		ar5.add("Selenium");
		ar5.add("UFT");
		
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Dev");
		ar6.add("Java");
		ar6.add("JavaScript");
		
		ar5.addAll(ar6);
		
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("*******************************");

		//removeAll:
		ar5.removeAll(ar6);
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("*******************************");

		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Appium");
		ar7.add("Postman");
		ar7.add("Jmeter");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Java");
		ar8.add("Python");
		ar8.add("JavaScript");
		
		ar7.retainAll(ar8);
		for(int i=0; i<ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}
		
	
	}
}