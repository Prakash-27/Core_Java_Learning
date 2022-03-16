package core.java.Collection_Framework_Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListExamples {

	/** List(I) is the Child of Collection(I).
	 *  IMPORTANT POINTS:
     *  =================
     *  1. ArrayList (C) is One of the classes provides Implementation for the List(I).
     *  2. Duplicate values are Allowed.
     *  3. Insertion order is Maintained.
     *  4. Underlying DS is resizeable Array or Growable Array.
     *  5. Can insert Heterogeneous Objects (If Generic's are not used).
     *
     *  eg:
     *  ---
     *     //Heterogeneous Objects will Import all the packages for the Interfaces and Class.
     *     //here we not using <> java Generic.
     *     List list = new ArrayList();
     *     list.add(1);
     *     list.add("String");
     *     System.out.println(list);
     *
     *  6. ArrayList is not Synchronized.
     *  7. It is Not a Thread Safe.
     *  8. Default capacity - 10
     *  9. Fill Ratio Or Load Factor: 1 or 100%
     *  10. Growth Rate: current_size + current_size/2
     *  eg: 10 + 10/2;
     *      10 + 5 = 15;
     *      Growth Rate: 15 
     *  
     *  eg:
     *
     *       List list = new ArrayList();
     *                ---------------
     *       list---->|1|2|3|4|5|6|7|
     *                 ---------------
     *       If we have to add 8 to this list
     *                 --------------- 
     *       list-\/->|1|2|3|4|5|6|7|      size is 7 |New List = size + size/2  
     *            /\  ---------------                |         =  7  +  3.4
     *                 | | | | | | |                 |         =  10.4
     *                \/\/\/\/\/\/\/                 |         =  10
     *                ---------------------
     *       list---->|1|2|3|4|5|6|7|8| | |
     *                ---------------------      
     *        
     *  11. implements RandomAccess, Serializable(This is a Network which is able to Transmit Data Serially)
     *      and Cloneable(We can Make a Clone for Interface) Interfaces.
     *  12. Best Suited for search Operations and performs worst on insertion and deletion.
     *  
     *   Index---> 0 1 2 3 4 5 6
     *            ---------------
     *            |1|2|3|4|5|6|7|
     *            --------------- 
     *   If we are going to insert one element at position (index = 2)
     *   
     *   Index---> 0 1  2  3 4 5 6
     *            -----------------
     *            |1|2|new|4|5|6|7|
     *            ----------------- 
     *   Insertion -> -> -> -> ->
     *             <- <- <- <- <- Removal
     *   For this one insertion Four Displacements Happend.
     *
     *   Same in the case of Removal.
     *   
	 */


	public void arrayListExamples() {

		 List<String> arrayList = new ArrayList<String>();
		 
		 arrayList.add("BMW");                                     
		 arrayList.add("BENZ");                                   
		 arrayList.add("BentLey");                                 
		 arrayList.add("Bugatti");                                  
		 arrayList.add("Bugatti"); //Duplication     
		 
		 System.out.println(arrayList);
		 
		 arrayList.get(0);
		 System.out.println(arrayList.get(0));
		 
		 arrayList.indexOf("BENZ");
		 System.out.println(arrayList.indexOf("BENZ"));
		 
		 arrayList.indexOf("Aston Martin");
		 System.out.println(arrayList.indexOf("Aston Martin"));

		 arrayList.lastIndexOf("Bugatti");
		 System.out.println(arrayList.lastIndexOf("Bugatti"));
		 
		 List<String> Another_arrayList = new ArrayList<String>();
		    Another_arrayList.addAll(arrayList);  
		    System.out.println(Another_arrayList);
		
		    Another_arrayList.clear();
		    //System.out.println(Another_arrayList.clear()); 
		    
		    arrayList.remove(0);    
		    System.out.println(arrayList.remove(0)); 
		    System.out.println(arrayList);

		    arrayList.add(null);
		    System.out.println(arrayList);
		    
		    arrayList.set(0,"Mitsubishi");
		    System.out.println(arrayList.set(0,"Mitsubishi"));
		    System.out.println(arrayList);
            
		    arrayList.isEmpty();
		    System.out.println(arrayList.isEmpty());
		    
		    //ITERATE
		    
		    //FOR EACH:
			for (String string : arrayList) {
				System.out.println("Using for each: " + string);
			}

			System.out.println("-----------------------------------------------------");
			
			//FOR LOOP:
			for(int i =0; i<arrayList.size(); i++){
			     arrayList.get(i);
			     System.out.println("Using for Loop: " + arrayList.get(i));
			}
			
			System.out.println("--------------------------------------------------");
			
			//ListIteratorMethod:
			
			ListIterator<String> list_iterator = arrayList.listIterator();
			
			//ListIterator Forward Traversing:
			
			while(list_iterator.hasNext()){
			    System.out.println(list_iterator.next());
			}
			
			System.out.println("--------------------------------------------------");
			
			//ListIterator Reverse Traversing:
			
			while(list_iterator.hasPrevious()){
			    System.out.println(list_iterator.previous());
			}
			
			System.out.println("--------------------------------------------------");
			
			//ITERATOR:
			
			Iterator<String> iterator = arrayList.iterator();    
		     
			while(iterator.hasNext()){
			    System.out.println(iterator.next());
			}     

			//ConcurrentModificationException:
			
//			for(String string : arrayList){
//			     System.out.println("Using for each: " + string);
//			     arrayList.add("Tea"); 
//			}

			System.out.println("--------------------------------------------------");

			
			//CopyOnWriteArrayList:
			
			CopyOnWriteArrayList<String> synCal = new CopyOnWriteArrayList<String>();

			//Adding elements to Synchronized ArrayList
			synCal.add("Pen");
			synCal.add("NoteBook");
			synCal.add("Ink");

			Iterator<String> synCalIterator = synCal.iterator();
			synCal.add("Eraser");
			synCal.add("Pencil");
			
			while(synCalIterator.hasNext()){
				System.out.println(synCalIterator.next());

				synCal.remove("Pencil");
			}
            
			System.out.println("Final List: " + synCal);

			System.out.println("--------------------------------------------------");
			
			//Heterogeneous Objects:
			
			//Heterogeneous Objects will Import all the packages for the Interfaces and Class.
			//here we are not using <> java Generic.
			List list = new ArrayList();
			list.add(1);
			list.add("String");
			list.add(3.14);
			list.add(synCal);
			System.out.println(list);

	}

	public static void main(String[] args) {

		ArrayListExamples examples = new ArrayListExamples();
		examples.arrayListExamples();

	}

}
