package core.java.String;

public class StringConcatenation {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 12.33;
		double d = 10.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(x+y+a+b+x+a+y+b);
		System.out.println(a+b+x+y+a+b);
		System.out.println(x+y+a+b+x+y);
		System.out.println(y+x+b+a);
		System.out.println(b+a+y+x);
		System.out.println(y+a+b+x);
		System.out.println(x+a+b+y);
		System.out.println(b+x+y+a);
		System.out.println(a+x+y+b);
		
		System.out.println(c=d);
		System.out.println(d=c);
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		
		System.out.println("the value of a is: "+a);
		System.out.println("the value of b is: "+b);
		System.out.println("Addition of a and b is: "+(a+b));
		System.out.println("Subraction of a and b is: "+(b-a));
		
		System.out.print("Java Programming");
		System.out.println("Automation Testing");
//============================================================================================================================		
		//IfElse Concept:
		
		//<> <=  >=  == !=
		
		int a1 = 20;
		int b1 = 30;
		
		if(a1 > b1) {
			System.out.println("a is greater than b");
		}else if(b1 > a1) {
			System.out.println("b is greater than a");
		}else {
			System.out.println("a is less than b");
		}
		
		int c1 = 40;
		int d1 = 40;
		
		if(c1==d1) {
			System.out.println("c1 and d1 are equal");
		}else {
			System.out.println("c1 and d1 are not equal");
		}
		
		int k = 100;
		int j = 200;
		int l = 300;
		
		if (k>j & k>l) {
			System.out.println("k is greatest");
		} 
		else if(j>l & j>l) {
			System.out.println("j is greatest");
		}
		else if(l>k & l>j) {
			System.out.println("l is greatest");
		}
		else {
			System.out.println("All the Three is not Great");
		}
		
	}

}
