package core.java.Interview_Questions;

public class NullConcepts {
	
	static Object obj;
	static String str;
	static NullConcepts nc;

	public static void main(String[] args) {

		//1.case sensitive --> Object obj = Null or NULL; this will not accept in java
		Object objt = null; //null can be declare only in lowerCase.
		System.out.println(objt);
		
		
		//2.Default reference value will be null
		System.out.println(obj);
		System.out.println(str);
		System.out.println(nc);
		
		
		//3.
//		Integer i = null; //Wrapper class object reference i holds the value null.
//		int j = i; //Then the Wrapper class object reference i have been equal to the 'int' primitive data type j, So this is give you the java.lang.NullPointerException.
		
		
		//4. instanceof
		Integer i1 = null;
		Integer j1 = 10;
		
		System.out.println(j1 instanceof Integer);//This will give you 'true' because j1 hold the value of 10. 
		//System.out.println(i1 instanceof Integer);//This will give you 'False' because i1 hold the value of null.
		
		//5. Static vs NonStatic
		NullConcepts object = null;
		object.Sum(); //Here Sum method is static the static object are not stored in class reference object that are stored in separate common memory location in java That what it can able to call the Sum Method. 
		//object.Send();//Here the send method is a non static method so that we want to create the object, through the object reference 'object' and then we can able to call the function, but the function is the null object that what its throws the  java.lang.NullPointerException. 
		
		//6. == and !=
		System.out.println("Null equals Null Gives: " + null == null);
		System.out.println("Null notequals Null Gives: " + null != null);
	
		//7.
		String str = null;
		Integer i2 = null;
		Double d2 = null;
		
		String s1 = (String) null;
		System.out.println(s1+"123");
		//System.out.println(s1.length());
		//System.out.println(s1.charAt(0));
		
		Integer i3 = (Integer) null;
		//i3.byteValue();
		
		Double d3 = (Double) null;
		
		
		
	}

	
	public static void Sum() {
		System.out.println("Sum...");
	}
	
	public void Send() {
		System.out.println("Send...");
	}
	
}
