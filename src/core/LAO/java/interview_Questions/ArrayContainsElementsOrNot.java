package core.LAO.java.interview_Questions;

import java.util.stream.IntStream;

public class ArrayContainsElementsOrNot {

	/**
	 * How to find an element Present in the array or Not
	 * 
	 * @param args
	 */

	int[] array = { 1, 2, 3, 4, 5, 3, 3 };

	int numberToFind = 3;

	boolean found = false;

	public void numberPresentInTheArrayOrNot() {
		for (int number : array) {
			if (number == numberToFind) {
				found = true;
				break;
			}
		}
		
		if (found) {
			System.out.println("Number is Present");
		} else {
			System.out.println("Number is Not Present");
		}
		System.out.println("-------------------------");
	}
	
	
	//Using IntStream
	public void usingIntStream() {
		boolean found = IntStream.of(array).anyMatch(element -> element == numberToFind);
		
		if(found) {
			System.out.println("Number is Present");
		}else {
			System.out.println("Number is Not Present");
		}
	}

	public static void main(String[] args) {
		
		ArrayContainsElementsOrNot elementsOrNot = new ArrayContainsElementsOrNot();
		elementsOrNot.numberPresentInTheArrayOrNot();
		elementsOrNot.usingIntStream();
		
	}

}