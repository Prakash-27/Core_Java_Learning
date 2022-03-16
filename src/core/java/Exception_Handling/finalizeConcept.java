package core.java.Exception_Handling;

public class finalizeConcept {

	//public final class finalizeConcept {
	//If we put final keyword on class level then we can't able to extends the Parent class in Child Class.
	//finalize is a Method()
	public void finalize() {
		System.out.println("finalize method");
	}
	
	public static void main(String[] args) {

		finalizeConcept f1 = new finalizeConcept();
		finalizeConcept f2 = new finalizeConcept();
		
		f1 = null;
		f2 = null;
		
		//finalize is the concept which will automatically called the finalize Method before calling Garbage Collector Function.
		//To destroy the Null Reference Objects.
		
		System.gc();
	}

}
