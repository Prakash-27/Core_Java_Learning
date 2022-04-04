package core.java.CanWeOverrideAStaticMethod_In_ChildClass;

public class ChildClass_or_SubClass extends ParentClass_or_SuperClass {

	//If we put the static keyword in Parent class Methods it will give the error in Child Class Methods 
	//So we can't Override the Static Methods
	//If we put the static keyword in child class method also it will give error
	//because the already the parent class method has the static in there methods So it will not overriden we have to remove the @Override annotation in House() Method.
	
	
	public static void House() {
		System.out.println("Child -- House");
	}
	
//	@Override
//	public void House() {
//		System.out.println("Child -- House");
//	}
	
}
