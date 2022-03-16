package core.java.Abstraction_Interface_and_Encapsulation;

public class Child_BMW extends Parent_Car {
	
	@Override
	public void engineSecret() {
		System.out.println("BMW engine Secret.");
	}
	
	
	@Override
	public void companyVault() {
		System.out.println("BMW engine Vault");
	}
	 
	
	public static void main(String[] args) {

		Parent_Car car = new Child_BMW(); //Dynamic Polymorphism
		car.engineSecret();
		car.companyVault();
	}
	

}
