package core.java.TypesofArrays;

public class OneDimentionalArray {

	//DisAdvantages of Array:
	//1.Size is Fixed --> static Array -- To OverCome this problem -- we use collection -- ArrayList, HashTable -- use dynamic array.
	//2.Store Only similar data type -- To OverCome this problem -- we use Object Array.
	
	public static void main(String[] args) {

		//Array--> To store a Similar data type values in a single variable.
		//1. int Array:
		//Lowest Bound/index = 0
		//Upper Bound/index = n-1 (n is size of Array)
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[3]);
		
		//because given array int value is 4 array start in 0,1,2,3, then how could it handle it with 4th array.
		//System.out.println(i[4]); // java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);
		
		for (int j = 0; j < i.length; j++) {
			 System.out.println(i[j]);
			
		}
		
		//2.Double Array:
		double d[] = new double[3];
		d[0] = 10.75;
		d[1] = 20.56;
		d[2] = 54.89;
		
		System.out.println(d[2]);
		
		//3.Char Array:
		char c[] = new char[3];
		c[0] = 'A';
		c[1] = 10;
		c[2] = '$';
		
		System.out.println(c[2]);
		
		//4.Boolean Array:
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		System.out.println(b[0]);
		
		//String Array:
		String s[] = new String[3];
		s[0] = "Selenium";
		s[1] = "Appium";
		s[2] = "Selenide";	
		
		System.out.println(s[0]);
		
		//Object Array: (Object is a Super Class) -- is used to store data types values.
		Object object[] = new Object[5];
		object[0] = "Ben 10";
		object[1] = 25;
		object[2] = 70.8;
		object[3] = 'M';
		object[4] = true;
		
		System.out.println(object.length);
		System.out.println(object[0]);
		
		for (int value = 0; value < object.length; value++) {
			System.out.println(object[value]);
		}
		
		
		
		
		
		
		
		
	}

}
