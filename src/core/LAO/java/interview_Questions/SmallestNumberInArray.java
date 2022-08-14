package core.LAO.java.interview_Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumberInArray {

	static int givenArray[] = { 2, 1, 3, 5, 4 };

	public static void main(String[] args) {

		// 1st Method
		int smallest = Integer.MAX_VALUE;
		System.out.println(smallest);

		for (int i = 0; i < givenArray.length; i++) {
			if (givenArray[i] < smallest) {
				smallest = givenArray[i];
			}
			System.out.println("Smallest Number is : " + smallest);
		}

		// 2nd Method
		Arrays.sort(givenArray);
		System.out.println(givenArray[0]);

		// 3rd Method

		/*
		 * List<int[]> list = Arrays.asList(givenArray);
		 * 
		 * Collections.sort(list);
		 * 
		 * int[] smallest1 = list.get(0);
		 * 
		 * System.out.println(smallest1);
		 */

	}

}