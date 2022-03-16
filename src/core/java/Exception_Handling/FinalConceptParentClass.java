package core.java.Exception_Handling;

public class FinalConceptParentClass {

	
	//public final class FinalConceptParentClass {
	//If we put final keyword on class level then we can't able to extends the Parent class in Child Class.
	public static void main(String[] args) {

		//Final Keyword is for Constant Variables.
		final int i = 90;
		
		//here before i = 90; is final mean we can't able to initialize another Constant number for same i Variable
		//.Then it will give error.
		
		//i = 100;
		//i = 200;
		
		//Why we are giving final keyword: Because that variable is the final we can't change that constant. 
	}

}
