package core.java.ConstructorTypes;

public class NoArgumentConstructor {
	
	Integer employeeId;
	String employeeName;
	
	// Define No Argument Constructor/Non Parameterized Constructor.
	
	public NoArgumentConstructor() {
		employeeId = 9;
		employeeName = "John Smith";
		System.out.println("Employee object is created");
	}

	public static void main(String[] args) {

		NoArgumentConstructor noArgumentConstructor = new NoArgumentConstructor();
		System.out.println(noArgumentConstructor.employeeId);
		System.out.println(noArgumentConstructor.employeeName);
	}

}
