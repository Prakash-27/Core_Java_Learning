package core.java.Interface_And_MultipleInheritance;

public class TestBank {

	public static void main(String[] args) {

		System.out.println(USBank.min_bal);
	  //USBank.min_bal = 200;
		
		HSBCBank hsbcBank = new HSBCBank();
		hsbcBank.CreditCard();
		hsbcBank.DebitCard();
		hsbcBank.MoneyTransfer();
		hsbcBank.educationLoan();
		hsbcBank.carLoan();
		hsbcBank.mutualFunds();
		
		System.out.println("---------------------");
		
		//Dynamic PolyMorphism
	   //Child Class object can be referred by Parent Interface reference var
		USBank usBank = new HSBCBank();
		usBank.CreditCard();
		usBank.DebitCard();
		usBank.MoneyTransfer();
		
	}

}
