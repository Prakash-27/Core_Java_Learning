package core.java.Overriding_Inheritance_Polymorphism;

public class BMW extends Car{
	
	//When same Method is Present in the parent class as well as child class with the same name and the same number of argument
	//is called Method Overriding.
	
	@Override
	public void Start() {
		System.out.println("BMW -- Start");
	}
	
	public void theftSaftey() {
		System.out.println("BMW -- theftSaftey");
	}
	
}
