package core.java.Abstraction_and_Interface;

public class BMW implements Car {

	@Override
	public void Start() {
       System.out.println("BMW -- Start");		
	}

	@Override
	public void Stop() {
       System.out.println("BMW -- Stop");		
	}

	@Override
	public void refuel() {
       System.out.println("BMW -- refuel");		
	}

	//non-overridden Method
	public void TheftSafty() {
		System.out.println("BMW -- TheftSafty");
	}
}
