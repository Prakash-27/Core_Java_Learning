package com.java.CollectionFramework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	//1.LinkedList is Node that have two parts Data and Next.
	//2.The First LinkedList node of a Data is the Head.
	//3.The Last LinkedList node of a Next is Connected to  ground (or) Null. 
	//4.Data and Next are in Single Node so it is also called as SinglyLinkedList.
	
	//Always one node can have a connection with next node by using the Next column
	//But one node cannot able to connect with Previous Node.
	
	//Some LinkedList are i)Doubly LinkedList
	                   //ii)circular LinkedList
	
	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		
		//add():
		ll.add("test");
		ll.add("UFT");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		ll.add("Cucumber");
		
		//print:
		System.out.println("content of linkedlist: " + ll);
		
		//addfirst:
		ll.add("Jai Sri");
		
		//addlast:
		ll.addLast("Ram");
		
		System.out.println("content of linkedlist: " + ll);
		
		//get:
		System.out.println(ll.get(0));
		
		//set:
		ll.set(0, "Erick");
		System.out.println(ll.get(0));
		
		//remove first and last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist: " + ll);
		
		//remove using index value.
		ll.remove(2);
		System.out.println("content of linkedlist: " + ll);
		
		//how to print all the values of LinkedList:
		//for loop
		
		System.out.println("********using for loop********");
		for(int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		
		//advance for loop 
		
		System.out.println("********using advance for loop*********");
		for(String str : ll) {
			System.out.println(str);
		}
		
		
		//iterator:
		System.out.println("********using iterator********");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//while loop:
		System.out.println("********using while loop********");
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}

		
	}   

}