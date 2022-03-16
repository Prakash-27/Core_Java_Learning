package core.java.String;

public class String_Methods_Examples {

	public static void main(String[] args) {
        		
        String name = "Prakash Pragathish";
		int number = 3;
		
		//returns character value for the particular index.
		System.out.println(name.charAt(1));
		
		//return string length
		System.out.println(name.length());
		
		//check the equality of the string with the given Object.
		System.out.println(name.equals("Prakash Pragathish"));
		
		//check the equality of the string with the given Object without case sensitivity.
		System.out.println(name.equalsIgnoreCase("praKasH pragaThisH"));
		
		//check the string is empty or not.
		System.out.println(name.isEmpty());
		//System.out.println(Blank.isBlank());
		
		//return true or false based on the given value is present or not.
		System.out.println(name.contains("s"));
		
		//take a particular portion of a String 
		String substring = "unHappy";
		System.out.println(substring.substring(2));
		
		//take a particular portion of a String with begin index will not take print in console and end index will be print in console.
		System.out.println(name.substring(4, 7));
		
		//append the string to the given string.
		System.out.println(name.concat("war"));
		
		//replace existing char with given char.
		System.out.println(name.replace("t", "d"));
		System.out.println(name.replaceFirst("Pragathish", "Raj"));
		
		//find the position of the character in string it ia opposite of charAt() method.
		System.out.println(name.indexOf("P"));
		
		//finds the character specified from the index position.
		System.out.println(name.indexOf("r", 7));
		
		//finds the character specified from the index position.
		System.out.println(name.indexOf("g", 5));
		System.out.println(name.indexOf("kash", 1));
		
		//Trim will remove the White Spaces before and after.
		String trim = " Ninja ";
		System.out.println(trim.trim());
		
		//convert the given data type to string.
		System.out.println(String.valueOf(number));
		
		//convert String upper case to lower case.
		String upperCase = "Lord Shiva";
		System.out.println(upperCase.toLowerCase());
		
		//convert String lower case to upper case.
		String lowerCase = "lord vishnu";
		System.out.println(lowerCase.toUpperCase());
		
		//return a join string with given delimiter
		System.out.println(String.join("-", "Im","Possible"));
		System.out.println(String.join("/", "09","09","9999"));
		
		//Split the variables by using one operator.
		String Split_This = "Indian_Premier_Leauge";
		String Splitted_Word[] = Split_This.split("_");
		
		for (String string : Splitted_Word) {
			System.out.println(string);
		}
			
		
	}

}
