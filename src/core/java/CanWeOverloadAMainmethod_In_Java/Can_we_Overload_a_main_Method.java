package core.java.CanWeOverloadAMainmethod_In_Java;

public class Can_we_Overload_a_main_Method {

	//Can we Overload a main Method --> Yes we can Overload a main method.
	
	//JVM -- main (String args[]) -- public static void
	public static void main(String[] args) {
		System.out.println("main method-1");
		
		main("Testing");
		main(12);
		main(26, 27);
	}
	
	
	public static void main(String args) {

		System.out.println("main method-2");
	}
	
	public static void main(int a) {

		System.out.println("main method-3");
	}

	public static void main(int a, int b) {

		System.out.println("main method-4");
	}
	
	
}
