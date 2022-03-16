package core.java.ConstructorTypes;

public class ParameterizedConstructor {
	
	String Animalname;
	String Animaltype;
	static ParameterizedConstructor animal;
	
	//Define Parameterized Constructor.
	
	public ParameterizedConstructor(String animalName, String animaltype) {
		Animalname = animalName;
		Animaltype = animaltype;
	}
	
	public void SayAbout_Animal() {
		System.out.println(" Animal name is " + Animalname + " Animal type is " + Animaltype);
	}

	public static void main(String[] args) {

	    animal = new ParameterizedConstructor("Lion", "Carnivorus");
	    animal.SayAbout_Animal();
	    
	    animal = new ParameterizedConstructor("Rhino", "Herbivorus");
	    animal.SayAbout_Animal();
	    
	    animal = new ParameterizedConstructor("Grizzly_Bear", "Omnivorus"); 
	    animal.SayAbout_Animal();
		
	}

}
