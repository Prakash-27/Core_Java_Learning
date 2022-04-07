package core.java.Interview_Questions;

public class PrimeNumber {

	//2 is a Lowest Prime Number.
	
	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumber(int num) {
		for(int i=2; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {

		System.out.println("2 is a PrimeNumber: "+isPrimeNumber(2));
		System.out.println("3 is a PrimeNumber: "+isPrimeNumber(3));
		System.out.println("5 is a PrimeNumber: "+isPrimeNumber(5));
		System.out.println("7 is a PrimeNumber: "+isPrimeNumber(7));
		System.out.println("9 is a PrimeNumber: "+isPrimeNumber(9));
		System.out.println("11 is a PrimeNumber: "+isPrimeNumber(11));
		System.out.println("13 is a PrimeNumber: "+isPrimeNumber(13));
		System.out.println("15 is a PrimeNumber: "+isPrimeNumber(15));
		System.out.println("17 is a PrimeNumber: "+isPrimeNumber(17));
		System.out.println("19 is a PrimeNumber: "+isPrimeNumber(19));
		System.out.println("20 is a PrimeNumber: "+isPrimeNumber(20));
		System.out.println("0 is a PrimeNumber: "+isPrimeNumber(0));
		System.out.println("-1 is a PrimeNumber: "+isPrimeNumber(-1));
		System.out.println("-3 is a PrimeNumber: "+isPrimeNumber(-3));
		
		getPrimeNumber(7);
		getPrimeNumber(11);
		getPrimeNumber(15);
		getPrimeNumber(20);
		
	}

}
