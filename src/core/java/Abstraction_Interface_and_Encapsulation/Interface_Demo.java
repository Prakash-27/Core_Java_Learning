package core.java.Abstraction_Interface_and_Encapsulation;

public interface Interface_Demo {

	//public, static & final by default in the Interface class.
	String MyProject = "Music Application";

	//public, abstract are by default in Methods 
	
	//public abstract void Music();
	void Music();
	
	//We can't create object for Interface because in Selenium we write.
	//WebDriver driver = new ChromeDriver();
	//WebDriver - is a Interface
	//driver - is a reference object
	//ChromeDriver() - is a class which can create object.
	
	//Never able to create Object for Interface.
	//Example: WebDriver driver = new WebDriver(); we can't create like this in Selenium.
	
	void headSet();
	void homeTheatre();
}
