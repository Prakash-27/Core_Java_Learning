package core.java.Polymorphism_Types;

public class Overriding_Child extends Overriding_Parents {
	
	/* This class is to illustrate method overriding
	 *  with a practical Example. */
	
	@Override
	public void IcecreamFor_Son() {
		System.out.println("Daddy!!! Flavour of the icecream is my choice so don't Restrict me. I want Chocolate Flavour.");
	}

	public static void main(String[] args) {

		Overriding_Parents parents = new Overriding_Child(); //ParentClass reference = new ChildClass();
		parents.MoneyForIcecream_Daddy();
		parents.IcecreamFor_Son();
	}

}
