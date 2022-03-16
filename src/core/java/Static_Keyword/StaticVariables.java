package core.java.Static_Keyword;

public class StaticVariables {

	static int accountBalance = 0;
	String depositedBy;
	
	public static void main(String[] args) {

		StaticVariables staticVariables1 = new StaticVariables();
		staticVariables1.accountBalance = 1000;
		staticVariables1.depositedBy = "Savings Account";
		
		StaticVariables staticVariables2 = new StaticVariables();
		staticVariables2.accountBalance = 2000;
		staticVariables2.depositedBy = "Current Account";
		
		System.out.println("staticVariables1 Integer: "+ staticVariables1.accountBalance);
		System.out.println("staticVariables1 String: "+ staticVariables1.depositedBy);
		System.out.println("staticVariables2 Integer: "+ staticVariables2.accountBalance);
		System.out.println("staticVariables2 String: "+ staticVariables2.depositedBy);
		
		
	}

}
