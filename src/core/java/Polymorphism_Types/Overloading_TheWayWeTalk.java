package core.java.Polymorphism_Types;

public class Overloading_TheWayWeTalk {

	/* This class is to illustrate method overloading
	 *  with a practical Example. */
	
	public void talk(Overloading_Parents styleOfTalking) {
		System.out.println("Polite, Respectfully, Caringly.");
	}
	
	public void talk(Overloading_Partner styleOfTalking) {
		System.out.println("Lovely, Romantically, Mixture of Everything.");
	}
	
	public void talk(Overloading_Boss styleOfTalking) {
		System.out.println("Nothing Personal, Only Job Perspective and Bussiness Oriented Talks.");
	}
	
	public static void main(String[] args) {

		Overloading_TheWayWeTalk wayWeTalk = new Overloading_TheWayWeTalk();
		
		Overloading_Parents parents = new Overloading_Parents();
		
		wayWeTalk.talk(parents);
		
		Overloading_Partner partner = new Overloading_Partner();
		wayWeTalk.talk(partner);
		
		Overloading_Boss boss = new Overloading_Boss();
		wayWeTalk.talk(boss);
	}

}
