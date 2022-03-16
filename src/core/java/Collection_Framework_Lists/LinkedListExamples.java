package core.java.Collection_Framework_Lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {

	/**
	 * i)LinkesList is opposite to ArrayList. 
	 * ii)Because here Insertion and Deletion Operation are Best Suited Operation for LinkedList. 
	 * iii)Performs Worst on Search and Retrieving Operation,Unlikely ArrayList, 
	 * This is not the best Retrieving the data. 
	 * iv)All the collections implements Serializable(This is a Network which is able to Transmit Data Serially) 
	 *    and Cloneable(We can Make a Clone for Interface) Interfaces. 
	 * v)LinkedList is also implements those Interfaces But Not RandomAccess Interface.
	 */
	/**
	 * LinkedList is implemented using Doubly linked list. This is best suited for insertion and deletion operations.
	 * Unlike ArrayList, this is not the best for retrieving the data.
	 * All the collections implements Serializable and cloneable Interfaces.
	 *  LinkedList also implements those Interfaces but not RandomAccess Interface.
	 */

	//LNKEDLIST OPERATION METHODS EXAMPLES:

	public void linkedListOperableMethodsExample() {

		//create a simple Linked List.

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		//List<Integer> list = new LinkedList<Integer>();
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(4);

		System.out.println("Linked List: " + linkedList);

		//Add an element to a First Position.

		linkedList.addFirst(1);

		System.out.println("Linked List After Adding First: " + linkedList);

		//Add an element at Last.

		linkedList.addLast(5);

		System.out.println("Linked List After Adding Last: " + linkedList);

		/*
		 * LinkedList performs the worst if the operation is retrieval of data.
		 * Hence if our requirement is to fetch data, we should use ArrayList.
		 * But LinkedList is the best choice if we have requirements of adding and 
		 * removing data very often. In this case we should avoid ArrayList
		 */

		//Get the First value.

		System.out.println("First Value: " + linkedList.getFirst());

		//Get the First value using index(0) Position.

		System.out.println("First Value: " + linkedList.get(0));

		/*
		 * Now get the third value of the list.
		 * Since LinkedList has the data structure of doubly linked list,
		 * the value of the third index is known only to the link present in
		 * the Second index. Internally, the program will traverse to index number 2 and then only
		 * it can get the value of 3. So Linked list is not suited for search operations.
		 */

		System.out.println("First Value: " + linkedList.get(3));

		//update the values using set().
		
//		Integer newFirst = linkedList.get(0);
//		linkedList.set(0, newFirst);
//		System.err.println("After 0th position updated :"+linkedList);

		//remove First value in linkedList. 

		System.out.println("Remove First: " + linkedList.removeFirst());
		System.out.println(linkedList);

		//remove Last value in linkedList.

		System.out.println("Remove Last: " + linkedList.removeLast());
		System.out.println(linkedList);

		//poll method delete the first element in the List.

		System.out.println(linkedList.poll());
		System.out.println(linkedList);

		System.out.println(linkedList.pollFirst());
		System.out.println(linkedList);

		//pollLast delete the last.

		linkedList.pollLast();
		System.out.println(linkedList.pollLast());

		//remove method delete the first element.

		//		linkedList.remove();
		//		System.out.println(linkedList);

		linkedList.addFirst(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add(7);
		linkedList.add(8);
		linkedList.add(9);

		System.out.println("After Second time add: " + linkedList);

		linkedList.removeFirstOccurrence(2);
		System.out.println("After Removing the First Occurrence of 2: " + linkedList.removeFirstOccurrence(2));

		linkedList.removeLastOccurrence(6);
		System.out.println("After Removing the Last Occurrence of 6: " + linkedList.removeFirstOccurrence(6));

		System.out.println("----------------------------------------------------------");
	}

	//ITERATION OF LINKEDLIST:

	//1.Iteration of LinkedList with simple for Loop:

	public void iterateLinkedListWithSimpleFor() {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");

		System.out.println("Simple for Loop");

		for(int index = 0; index<linkedList.size(); index++) {

			System.out.println("Elements in the LinkedList are: " + linkedList.get(index));
		}
		System.out.println("-----------------------------------------------------");
	}

	//2.Iteration of Linked List with Advanced For Each Loop:

	public void iterateWithAdvancedForEach() {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");

		System.out.println("for each Loop");

		for(String string : linkedList) {

			System.out.println("Elements in the LinkedList are: " + string);
		}
		System.out.println("------------------------------------------------------");
	}

	//3.Iteration of Linked List with While Loop:

	public void iterateUsingWhileLoop() {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		int number = 0;
		System.out.println("While Loop");

		while(linkedList.size() > number) {

			System.out.println("Elements in the LinkedList are: " + linkedList.get(number));
			number++;
		}
		System.out.println("------------------------------------------------------");
	}

	//3.1 Iteration of Linked List with Do While Loop:

	public void iterateUsingDoWhileLoop() {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		int number = 0;
		System.out.println("Do While Loop");

		do {

			System.out.println("Elements in the LinkedList are: " + linkedList.get(number));
			number++;
		}while(linkedList.size() > number);

		System.out.println("------------------------------------------------------");
	}


	//4.Iteration Iterate Using Iterator:

	public void iterateUsingIterator() {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		Iterator<String> iterator = linkedList.iterator();
		System.out.println("Iterator");

		while(iterator.hasNext()) {

			System.out.println("Elements in the LinkedList are: " + iterator.next());
		}
		System.out.println("------------------------------------------------------");
	}


	public static void main(String[] args) {

		LinkedListExamples linkedListExamples = new LinkedListExamples();
		linkedListExamples.linkedListOperableMethodsExample();
		linkedListExamples.iterateLinkedListWithSimpleFor();
		linkedListExamples.iterateWithAdvancedForEach();
		linkedListExamples.iterateUsingWhileLoop();
		linkedListExamples.iterateUsingDoWhileLoop();
		linkedListExamples.iterateUsingIterator();

	}

}
