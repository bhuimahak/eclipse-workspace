package arrayBasedProblems;

import java.util.Arrays;

public class IfAnArrayContainsAnumber {
	// to Find if an array contains a given number or not

	public static void main(String[] args) {
		int[] arr = { 1, 10, 2, 0, 9, 7 };
		int givenElement = 10;
		boolean result = checkNumber(arr, givenElement);
		System.out.println("Is number present? " + result);
	}

	private static boolean checkNumber(int[] arr, int givenElement) {
		boolean isNumberPresent = false;
		Arrays.sort(arr); // order of complexity is O(n logn) and binary searh
							// is (log n)
		// Arrays.binarySearch(arr, givenElement);
		// implementing Binary Search here
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			int mid = (i + j) / 2;
			if (arr[mid] == givenElement) {
				isNumberPresent = true;
				break;
			}
			if (givenElement < arr[mid]) {
				j = mid - 1;
			}
			if (givenElement > arr[mid]) {
				i = mid + 1;
			}
			// if(arr[j] == givenElement){
			// isNumberPresent = true;
			// break;
			// }
		}
		return isNumberPresent;
	}
}
