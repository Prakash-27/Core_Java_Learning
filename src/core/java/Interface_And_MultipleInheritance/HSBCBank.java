package core.java.Interface_And_MultipleInheritance;

public class HSBCBank implements USBank, BrazilBank {

	//If a class is implementing any Interface, then its mandatory to define /overriding all the methods of Interface.
	//overriding from USBank
	
	@Override
	public void CreditCard() {
		System.out.println("hsbc -- credit");
		
	}

	@Override
	public void DebitCard() {
		System.out.println("hsbc -- debit");
		
	}

	@Override
	public void MoneyTransfer() {
		System.out.println("hsbc -- moneyTransfer");
		
	}
	
	//Separate Method of HSBCBank Class
	
	public void educationLoan() {
		System.out.println("hsbc -- edu loan");
		
	}

	public void carLoan() {
		System.out.println("hsbc -- car loan");
		
	}

	@Override
	public void mutualFunds() {
		System.out.println("hsbc -- mutual Fund");
		
	}
	

	
}
