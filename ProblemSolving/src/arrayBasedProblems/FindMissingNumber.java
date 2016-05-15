package arrayBasedProblems;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = new int[99];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		System.out.println(Arrays.toString(arr));
		findMissingNumber(arr);
	}

	private static void findMissingNumber(int[] arr) {
		int expectedSum = 0;
		for (int i = 1; i <= 100; i++) {
			expectedSum = expectedSum + i;
		}
		int actualSum = 0;
		for (int j = 0; j < arr.length; j++) {
			actualSum = actualSum + arr[j];
		}
		int missingNumber = expectedSum - actualSum;
		System.out.println("Missing number is " + missingNumber);
	}
}
