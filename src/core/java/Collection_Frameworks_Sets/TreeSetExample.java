package core.java.Collection_Frameworks_Sets;

import java.util.Iterator;
import java.util.TreeSet;
import java.lang.*;
public class TreeSetExample {

	/**
	 * 1.TREESET(Class) is the implementation class of SORTEDSET(Interface), NAVIGABLESET(Interface).
	 * 2.Duplicates values are NOT allowed.
	 * 3.Elements will be Retrieved on NATURAL SORTING ORDER.
	 * 4.It has 6 methods like first,last,headSet,tailSet,subSet and comparator.
	 * 5.Difference between HashSet and TreeSet, hash doesn't maintain order.
	 * 6.but TreeSet maintains ascending or alphabetical order.
	 * 7.underlying DS-> Binary Search Tree.
	 * 8.Heterogeneous data not allowed. If added Exception, ClassCast will occur
	 */
	
	/** 1.For default natural sorting order,the objects should be homogeneous and comparable else class cast exception
	 *  2.In TreeSet we want to use Generic type means it have three conditions:
	 *	 i.the objects should be homogeneous.
	 *	 ii.then the Generic<Integer> type want to Implement Comparable Interface.
	 *	 iii.All the Wrapper classes extends Comparable Interface so it will not throw class cast exception.
	 * 	3.But in StringBuffer StringBuilder classes will not implement Comparable Interface that why class cast exception was thrown.
	 *  4.To say any class is comparable or not, the class should implement comparable interface.
	 */
	
	/*
	 * Constructors present are 4
	 * 1. TreeSet ts= new TreeSet();// default sort order
	 * 2. TreeSet ts= new TreeSet(Comparator c);// customized sorting order defined by comparator object
	 * 3. TreeSet ts= new TreeSet(Collection c);// equivalent tree set of any collection will be created
	 * 4. TreeSet ts= new TreeSet(SortedSet s);// creates tree set for given sorted set
	 */
	
	public void treeSetExample(){
		//Creating object
		//Adding null to a non empty tree set causes null pointer excpetion.
		
		/*null can be easily added if the tree set is empty.Since(1.6 Version) If there are any elements present, the
		 * comparator will check for the sorting order between the previosly added element and 
		 * the null. Since it compares null with the objects exisiting we are getting NullPointerException.
		 * Same is the case, if we add null first and add other elements, NullPointerException will happen.
		 */
		
		//treeSet.add(null);
		
		TreeSet<Integer> treeSet= new TreeSet<Integer>();
		//treeSet.add(null);
		treeSet.add(10);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(9);
		treeSet.add(7);
		treeSet.add(3);
		
		System.out.println("Elements are sorted on ascending order :"+ treeSet);
		
		//first()
		//first: It returns first lowest method in a Set.
		System.out.println("First element :"+treeSet.first());
		
		//last()
		//last: It returns first highest method in a Set.
		System.out.println("Last element :"+treeSet.last());
		
		//headSet()
		//headSet will give the lesser value of subset, with Greater value as Input. 
		//If we give 3 as a input mean [1,2] is the Output.
		//headSet have not print the value which we gives as input like 3.
		System.out.println("Values lesser than given value"+treeSet.headSet(3));
		
		//tailSet()
		//tailSet will give the output of, what value we have given for input on that it wil take Greater values to print as Output.
		//It will Consider the Greater value and So on, 
		//If we give 7(It also consider the Given Input value also in console) as input then Output would be [7,9.10].
		System.out.println("Values equal to and higher than given value"+treeSet.tailSet(9));
		
		//subSet()
		//subSet will give output as, which value we give for input like 2 to 9 as limit 
		//it will give the Output of InBetween value of which we give as Input.
		//Like 2 to 9 means Output was [2, 3, 7]
		//subSet will consider Input value First number for Output value First number '2' .
		System.out.println("Subset values :"+treeSet.subSet(2, 9));
		
		//comparator()
		//comparator will check values in with Sorting Order, We can also tell Expilictly Customize the values for Sorting Order.
		//But it have been sorted in Default way --> It will Return NULL.
		System.out.println("Comparator returns null if the sorting is default natural order :"+ treeSet.comparator());
		
		
		//Comparable(), CompareTo() Methods are we want to see in Future. for Better Understanding
		
		System.out.println("Higher: "+ treeSet.higher(3));
		
		System.out.println("Lower: "+ treeSet.lower(2));
		
		//Poll First: Method will give the first value in Set, but at the same time it also delete the other values in Sets.
		System.out.println("Poll First: "+ treeSet.pollFirst());
		
		//Poll Last: Method will give the Last value in Set, but at the same time it also delete the other values in Sets.
		System.out.println("Poll Last: "+ treeSet.pollLast());
		
		//DescendingSet: It will print object value in descending order.	
		System.out.println("Descending Order set: "+treeSet.descendingSet());
		
		//Ceiling: Ceiling is return least element but also return Null for out of Bound values.
		System.out.println("Ceiling is return least element but also return Null for out of Bound values "+treeSet.ceiling(9));
		
		//floor: floor is return least element but also return Null for out of Bound values.
		System.out.println(treeSet.floor(7));
		
		
		//Normal Iterator: Here Normal iterator is act as a Forward Traversing iterator.
		//Forward Traversing iterator:
		Iterator<Integer> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			 System.out.println("Normal iterator is act as a Forward Traversing iterator: "+ iterator.next());
		} 
		
		//Descending Iterator: Here Descending Iterator is act as a Reverse Traversing iterator.
		//Reverse Traversing iterator:
		Iterator<Integer> descendingIterator = treeSet.descendingIterator();
		while (descendingIterator.hasNext()) {
			System.out.println("Descending Iterator is act as a Reverse Traversing iterator: "+descendingIterator.next());	
		}
		
		//For default natural sorting order,the objects should be homogeneous and comparable else class cast exception will throw.
		//In TreeSet we want to use Generic type means it have three conditions:
		//1.the objects should be homogeneous.
		//2.then the Generic<Integer> type want to Implement Comparable Interface.
		//3.All the Wrapper classes Implement Comparable Interface so it will not throw class cast exception.
		//But in StringBuffer StringBuilder classes will not implement Comparable Interface that why class cast exception was thrown.
		
		//But in my java version StringBuffer can also Implement Comparable Interface.
		//also my Program also run without throwing class cast exception.
		
		TreeSet<StringBuffer> stringBuffersTreeSet = new TreeSet<StringBuffer>();
		stringBuffersTreeSet.add(new StringBuffer("D"));
		stringBuffersTreeSet.add(new StringBuffer("c"));
		stringBuffersTreeSet.add(new StringBuffer("B"));
		stringBuffersTreeSet.add(new StringBuffer("A"));
		System.out.println(stringBuffersTreeSet);
		
	}
	
	public static void main(String[] args) {
	
		TreeSetExample treeSetExample= new TreeSetExample();
		treeSetExample.treeSetExample();
	}

}