package core.java.Interview_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmStrongNumber {

	// ArmStrong Numbers(0 to 999 and 1000 t0
	// 9999):1,2,3,4,5,6,7,8,9,153,370,371,407,1634,8208,9474
	// 1*1*1 = 1
	// 5*5*5 = 125
	// 3*3*3 = 27
	// 1+125+27 = 151
	// 407 == 4*4*4 + 0 + 7*7*7 = 407
	// 0
	// 1 == 1*1*1 = 1
	// 370, 371

	// 1.
	public static void isArmStrong(int num) {
		// 151 == 1*1*1 5*5*5 1*1*1
		System.out.println("Given Number is: " + num);
		int cube = 0;
		int r;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}

		if (t == cube) {
			System.out.println("This is an ArmStrong Number");
		} else {
			System.out.println("This is not an ArmStrong Number");
		}
	}

//------------------------------------------------------------------------------------------------------------------------------	

	// 2.
	public static double isArmstrongNumber(long n) {

		int j = 0;
		double sum = 0;
		ArrayList<Long> a = new ArrayList<Long>();

		while (n > 0) {

			long i = n % 10;
			n = n / 10;
			a.add(i);
		}

		while (j < a.size()) {

			sum = sum + Math.pow(a.get(j), a.size());

			j++;
		}
		return sum;
	}

	public static void main(String[] args) {

		// 1.
		isArmStrong(153);
		isArmStrong(370);
		isArmStrong(0);
		isArmStrong(1);
		isArmStrong(455);

		System.out.println("-------------------------------------");

		// 2.
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER A NUMBER");

		long num = sc.nextLong();

		double sum = isArmstrongNumber(num);

		if (num == sum) {
			System.out.println(num + " IS AN ARMSTRONG NUMBER ");
		}
		else {
			System.out.println(num + " IS NOT AN ARMSTRONG NUMBER ");
		}
	}
}