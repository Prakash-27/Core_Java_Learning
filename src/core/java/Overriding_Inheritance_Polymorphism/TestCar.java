package core.java.Overriding_Inheritance_Polymorphism;

public class TestCar {

	public static void main(String[] args) {

		//Static PolyMorphism or Compile Time PolyMorphism.
		BMW bmw = new BMW();
		bmw.Start();
		bmw.Stop();
		bmw.refuel();
		bmw.theftSaftey();
		bmw.engine();
		
		System.out.println("-------------------");
		
		Car car = new Car();
		car.Start();
		car.Stop();
		car.refuel();
		
		System.out.println("-------------------");
		
		//Dynamic PolyMorphism or Run Time PolyMorphism.
		//Top Casting
		Car car1 = new BMW(); //Parent Class is Referring the Child class Object is called Dynamic PolyMorphism.
		car1.Start();
		car1.Stop();
		car1.refuel();
	  //car1.theftSaftey(); 
		
	  //Here we take the BMW object but reference is the Parent class Car So we can access only the car class method not BMW class Methods
     //even though we are creating the Object of the BMW class it won't allow to access it.
    //Only the Pure BMW class Object can access the theftSafty() Method.	
		
	   //Down Casting
		BMW bmw1 = (BMW) new Car(); //This is Possible it will give ClassCastException.
		
	//Exception in thread "main" java.lang.ClassCastException: class core.java.Overriding_Inheritance_Polymorphism.Car cannot be cast to class core.java.Overriding_Inheritance_Polymorphism.BMW 
	//(core.java.Overriding_Inheritance_Polymorphism.Car and core.java.Overriding_Inheritance_Polymorphism.BMW are in unnamed module of loader 'app')
	}
}
