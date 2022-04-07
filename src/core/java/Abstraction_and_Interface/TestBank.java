package core.java.Abstraction_and_Interface;

public class TestBank {

	public static void main(String[] args) {

		HDFCBank hdfcBank = new HDFCBank();
		hdfcBank.Credit();
		hdfcBank.Debit();
		hdfcBank.loan();
		hdfcBank.funds();
		
		
		Bank b = new HDFCBank();
		b.Credit();
		b.Debit();
		b.loan();
		//b.funds(); This is not able to call because its in the HDFCBank class non overridden method
		//Here we are calling the HDFCBank object with Bank Reference So only Bank class Object are called Even though HDFCBank Object is Written.
		
	}

}
