package core.LAO.java.interview_Questions;

public class SwapTwoNumbers {

	public void withThirdVariable(int value1, int value2) {

		System.out.println("Before Swapping value1 : " + value1 + " and value2 : " + value2);

		int temp;
		temp = value1;
		value1 = value2;
		value2 = temp;

		System.out.println("After Swapping value1 : " + value1 + " and value2 : " + value2);

	}

	public void withoutThirdVariable(int firstValue, int secondValue) {

		System.out.println("Before Swapping firstValue : " + firstValue + " and secondValue : " + secondValue);

		// Multiply and division
		firstValue = firstValue * secondValue;
		secondValue = firstValue / secondValue;
		firstValue = firstValue / secondValue;

		// Addition and Subtraction
		firstValue = firstValue - secondValue;
		secondValue = firstValue + secondValue;
		firstValue = secondValue - firstValue;

		System.out.println("After Swapping firstValue : " + firstValue + " and secondValue : " + secondValue);

	}

	public static void main(String[] args) {

		SwapTwoNumbers numbers = new SwapTwoNumbers();
		numbers.withThirdVariable(30000, 45000);
		numbers.withoutThirdVariable(10, 50);

	}

}
