package core.java.String;

public class StringInterpolation {

	public static void main(String[] args) {

		String custName = "Kevin";
		int age = 45;
		String streetName = "4131 California Avenue";
		String city = "Los Angeles";
		String state = "California";
		String country = "USA";
		String zipcode = "90012";
		
		//String Interpolation
		
		System.out.println(String.format("Student Details: name: %s, age: %d, Address: %s, City: %s, State: %s" +
				"Country: %s, Zipcode: %s", custName, age, streetName, city, state, country, zipcode));
		
		
		
	}

}
