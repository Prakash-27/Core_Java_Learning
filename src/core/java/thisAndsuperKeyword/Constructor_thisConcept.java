package core.java.thisAndsuperKeyword;

public class Constructor_thisConcept {

	//class vars
	String name;
	int age;
	
	public Constructor_thisConcept(String name, int age) {

		this.name = name;
		this.age = age;
		//here we can also call the name without using this by changing the variable name like, String name1,name2 etc
		//But This is a bad practice when 1000 of constructor is in class means we have to give the variable (String name1,name2) name as Many.
		//So we want to use this.name for Best Practice.
		
		System.out.println(name);
		System.out.println(age);
		
	}

	

	public static void main(String[] args) {



	}

}
