package core.java.Polymorphism_Types;

public class Overloading_Addition {

	int add(int n1, int n2) {
		
		return n1+n2;
	}
	
	int add(int n1, int n2, int n3) {
		
		return n1+n2+n3;
	}
	
	float add(float n1f, float n2f) {
		
		return n1f+n2f;	
	}
	
	public static void main(String[] args) {

		Overloading_Addition addition = new Overloading_Addition();
		
		System.out.println("Sum of two numbers: "+ addition.add(12, 26));
		System.out.println("Sum of three numbers: "+ addition.add(27, 9, 8));
		System.out.println("Sum of Two Float numbers: "+addition.add(3, 8));
	}

}
