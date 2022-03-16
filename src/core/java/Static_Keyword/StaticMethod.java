package core.java.Static_Keyword;

public class StaticMethod {
	
	public static void method1() {
		System.out.println("Static Method");
	}

	public void method2() {
		System.out.println("Non Static Method");
	}
	
	public static void main(String[] args) {

		method1();
		StaticMethod staticMethod = new StaticMethod();
		staticMethod.method2();
		//staticMethod.method1();
		
	}

}
