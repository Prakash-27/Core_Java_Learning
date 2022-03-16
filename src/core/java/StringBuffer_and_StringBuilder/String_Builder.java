package core.java.StringBuffer_and_StringBuilder;

public class String_Builder {

	public static void main(String[] args) {

		// To demonstrate String Builder is Mutable.

		System.out.println("String is IMMUTABLE");
		String name = "John";
		System.out.println("Concating a name to Original : " + name.concat("Smith."));
		System.out.println("Original name: " + name);
		System.out.println("****************************************");
		System.out.println("StringBuilder is MUTABLE");
		StringBuilder builder = new StringBuilder("John");
		System.out.println("Appending a name to Original : " + builder.append("Smith."));
		System.out.println("Original name: " + builder);


		//StringBuffer Methods.

		//Reverse
		System.out.println("Reverse name: "+ builder.reverse());

		//Replace
		StringBuilder builder2 = new StringBuilder("Mitchell Johnson");
		System.out.println(builder2.replace(9, 15, "Marsh"));

		//Delete
		StringBuilder builder3 = new StringBuilder("xyzLabel");
		System.out.println(builder3.delete(0, 3));

		//Insert
		StringBuilder builder4 = new StringBuilder("William");
		System.out.println(builder4.insert(7, "Son"));

		//Capacity
		System.out.println(builder.capacity());

		//Like String we have charAt, Substring, length methods as well.


	}

}
