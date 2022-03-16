package core.java.DatatypeAndWrapperclassesAndReturntype;

public class Datatypes_and_WrapperClasses_Concept {

	Long accountNumber = 1234567890L;
	
	String holderName = "Prakash";
	
	Integer accountBalance = 1000;
	
	//Integer integer = new Integer(0);
	
	public static void main(String[] args) {
        //ClassName objName = new ClassName();
		Datatypes_and_WrapperClasses_Concept account = new Datatypes_and_WrapperClasses_Concept();
		account.getBalance();
		
		String name = account.holderName;
		System.out.println(" Account Name: "+name);
		
	    long AccNum = account.accountNumber;
	    System.out.println(" Account Number: "+AccNum);
		
	}
	
	public void getBalance() {
		System.out.println(" Balance is: " + accountBalance);
	}
	
}
