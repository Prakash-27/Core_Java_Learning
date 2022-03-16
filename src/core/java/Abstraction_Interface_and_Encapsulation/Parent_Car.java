package core.java.Abstraction_Interface_and_Encapsulation;

public abstract class Parent_Car {

	/*
	 * public void engineSecret() { System.out.println("Car's engine Secret."); }
	 * 
	 * public void engineVault() { System.out.println("Car's engine Vault"); }
	 */

	public abstract void engineSecret();

	public abstract void companyVault();

	public void engineOil(){
		System.out.println("EngineOil for car"); 
	}                                      

}
