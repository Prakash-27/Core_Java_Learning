package core.java.thisAndsuperKeyword;

public class ParentClass {
	
	public ParentClass() {
       System.out.println("Parent Constructor");
	}

	public ParentClass(int i) {
		System.out.println("Parent class Constant with value i: "+ i);
	}
	
	public ParentClass(int i, int j) {
		System.out.println("Parent class Constant with value i: "+ i);
		System.out.println("Parent class Constant with value j: "+ j);
	}
	
	public static void main(String[] args) {

	}

}
