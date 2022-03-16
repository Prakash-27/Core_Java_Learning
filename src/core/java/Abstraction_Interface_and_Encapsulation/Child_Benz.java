package core.java.Abstraction_Interface_and_Encapsulation;

public class Child_Benz extends Parent_Car implements Interface_Demo, Interface_Demo2, Interface_Demo3 {

	@Override
	public void engineSecret() {
		System.out.println("Benz engine Secret.");
	}
	
    @Override
	public void companyVault() {
		System.out.println("Benz engine Vault");
	}
	
	public static void main(String[] args) {

		Parent_Car car = new Child_Benz(); 
		car.engineSecret();
		car.companyVault();
	}

	@Override
	public void Music() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void headSet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void homeTheatre() {
		// TODO Auto-generated method stub
		
	}

}
