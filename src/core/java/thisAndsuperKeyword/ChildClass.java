package core.java.thisAndsuperKeyword;

public class ChildClass extends ParentClass {

	static ChildClass childClass;
	
	public ChildClass() {
		super(); //super keyword is not visible to naked eye but it will be there when extends ParentClass.
		System.out.println("Child Constructor");
	}

	public ChildClass(int i) {
		super(i); 
		System.out.println("Child Constructor with i value");
	}
	
	public ChildClass(int i, int j) {
		super(i,j); 
		System.out.println("Child Constructor with i and j value");
	}
	
	public static void main(String[] args) {

		childClass = new ChildClass();
		childClass = new ChildClass(10);
		childClass = new ChildClass(10,20);
		
	}

}
