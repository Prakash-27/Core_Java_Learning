package core.java.thisAndsuperKeyword;

public class ChildClass extends ParentClass {

	static ChildClass childClass;
	
	public ChildClass() {
		super(); //This keyword is not visible to naked eye but it will be there when extends ParentClass.
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {

		childClass = new ChildClass(); 
	}

}
