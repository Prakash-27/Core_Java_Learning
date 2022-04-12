package core.java.InterviewQuestions_And_TrickyJavaQuestions;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "The rains have started heres";
		String str1 = "The rains Have started heres";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s')); // 1st Occurrence of s
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1)); // 2nd Occurrence of s
		
		System.out.println(str.indexOf('s', str.indexOf('s', str.indexOf('s')+1)+1)); // 3rd Occurrence of s
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("Hello")); //value in the console is -1
		
		//String Comparison
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		//Substring
		System.out.println(str.substring(0, 9));
		
		//trim
		String s = "   Hello World   "; //This will trim the before and after space of the words, but space in the inBetween Hello World will not trimed.
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ", ""));
		
		String date = "12-04-2022";
		System.out.println(date.replace("-", "/"));
		
		//Split
		String test = "Selenium_Testing_is_a_UI_Testing";
		String[] testVal = test.split("_");
		for(int i=0; i<testVal.length; i++) {
			System.out.println(testVal[i] + " ");
			
		}
		
		//concat
		String s2 = "car";
		System.out.println(s2.concat("ing"));
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
	
		
	}

}
