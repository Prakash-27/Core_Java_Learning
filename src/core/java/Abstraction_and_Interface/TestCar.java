package core.java.Abstraction_and_Interface;

public class TestCar {

	public static void main(String[] args) {

		BMW bmw = new BMW();
		bmw.Start();
		bmw.Stop();
		bmw.refuel();
		bmw.TheftSafty();
		
		System.out.println("--------------------");
		
		Car c = new BMW();
		c.Start();
		c.Stop();
		c.refuel();
		//c.TheftSafty();
	}

}
