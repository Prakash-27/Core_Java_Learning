package core.java.DatatypeAndWrapperclassesAndReturntype;

public class Return_type {

	Integer collectedAmount = 1000;
	
	
	// Without return type.
	public void collectAmountandGiveItToMe() {
		System.out.println("Elder Brother have collected Rupee: " + collectedAmount);
	}
	
	
	// with return type.
	public Integer collectAmountAndGiveItToMe() {
		System.out.println("Elder Brother have collected Rupee: " + collectedAmount + " and sent it to you");
		return collectedAmount;
	}
	
	
	public static void main(String[] args) {
		
        //without return type.
		Return_type YoungerBrother = new Return_type();
	    YoungerBrother.collectAmountandGiveItToMe();
	    
		//with return type. 
		Integer amount = YoungerBrother.collectAmountAndGiveItToMe();
		System.out.println("Got the Amount YoungerBrother: " + amount);
		
		
		
	}

}
