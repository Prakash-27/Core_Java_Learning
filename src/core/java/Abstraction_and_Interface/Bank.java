package core.java.Abstraction_and_Interface;

public abstract class Bank {

	int amt = 100;
	final int rate = 10;
	static int loanrate = 20;
	
	//partial abstraction
	//hiding the implementation logic -- is called abstraction (oops concept)
	//Abstract class can have Abstract method and non-Abstract method
	//can not create the object of Abstract class
	//In Abstract class cannot create Object.
	//Abstract class is more faster than Interface
	
	public abstract void loan(); //abstract method --> no method body only method declaration.
	                             //method prototype
	//non-abstract method
	public void Credit() {
		System.out.println("Bank -- Credit");
	}
	
	public void Debit() {
		System.out.println("Bank -- Debit");
	}
	
}
