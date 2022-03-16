package core.java.StringBuffer_and_StringBuilder;

public class String_Buffer {

	public static void main(String[] args) {

		//To demonstrate String Buffer is Mutable.
		
		System.out.println("String is IMMUTABLE");
		String name = "John";
		System.out.println("Concating a name to Original : " + name.concat("Smith."));
		System.out.println("Original name: " + name);
		System.out.println("****************************************");
		System.out.println("StringBuffer is MUTABLE");
		StringBuffer buffer = new StringBuffer("John");
		System.out.println("Appending a name to Original : " + buffer.append("Smith."));
		System.out.println("Original name: " + buffer);
	
		
		//StringBuffer Methods.
		
		//Reverse
		System.out.println("Reverse name: "+ buffer.reverse());
		
		//Replace
		StringBuffer buffer2 = new StringBuffer("Mitchell Johnson");
		System.out.println(buffer2.replace(9, 15, "Marsh"));
		
		//Delete
		StringBuffer buffer3 = new StringBuffer("xyzLabel");
		System.out.println(buffer3.delete(0, 3));
		
		//Insert
		StringBuffer buffer4 = new StringBuffer("William");
		System.out.println(buffer4.insert(7, "Son"));
		
		//Capacity
		System.out.println(buffer4.capacity());
		
		//Like String we have charAt, Substring, length methods as well.
		
		
	}

}
