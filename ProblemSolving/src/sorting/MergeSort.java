package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// int[] arr = { 10, 4, 3, 1, 11, 9 };
		// int startIndex = 0;
		// int endIndex = arr.length - 1;
		// mergeSort(arr, startIndex, endIndex);
		// System.out.println(Arrays.toString(arr));

		int[] arr = { 3, 4, 10, 1, 9, 11 };
		int startIndex = 0;
		int mid = 2;
		int endIndex = arr.length - 1;
		sortedMerge(arr, startIndex, mid, endIndex);
		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSort(int[] arr, int startIndex, int endIndex) {

		if (startIndex >= endIndex) {
			return;
		}
		int mid = (startIndex + endIndex) / 2;
		mergeSort(arr, startIndex, mid);
		mergeSort(arr, mid + 1, endIndex);
		sortedMerge(arr, startIndex, mid, endIndex);
	}

	private static void sortedMerge(int[] arr, int start, int mid, int end) {
		// int[] a = Arrays.copyOfRange(arr, startIndex, mid);
		// int[] b = Arrays.copyOfRange(arr, mid + 1, endIndex);

		int firstLength = mid - start + 1;

		int secondLength = end - mid;

		int[] first = new int[firstLength + 1];

		int[] second = new int[secondLength + 1];

		System.arraycopy(arr, start, first, 0, firstLength);

		first[firstLength] = Integer.MAX_VALUE;

		System.arraycopy(arr, mid + 1, second, 0, secondLength);

		second[secondLength] = Integer.MAX_VALUE;

		System.out.println("first: " + Arrays.toString(first));

		System.out.println("second: " + Arrays.toString(second));

		int i = 0;
		int j = 0;

		for (int k = start; k <= end; k++) {

			if (first[i] < second[j]) {

				arr[k] = first[i];

				i++;

			}

			else {

				arr[k] = second[j];

				j++;

			}

		}

		System.out.println("array: " + Arrays.toString(arr));

	}
}
