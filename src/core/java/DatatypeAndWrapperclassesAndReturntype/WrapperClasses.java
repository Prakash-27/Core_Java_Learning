package core.java.DatatypeAndWrapperclassesAndReturntype;

public class WrapperClasses {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);
		
		//data Conversion: String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//data conversion: String to Double
		String y = "9.9";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to Boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to String Conversion
		int j = 200;
		System.out.println(j+20);
		
		String s = String.valueOf(j); //This is Concat the s value to 20020
		System.out.println(s+20);
		
		
		String u = "100A";
		Integer.parseInt(u); //java.lang.NumberFormatException -- for input String: "100A"
	
	}

}
