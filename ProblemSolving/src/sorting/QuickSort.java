package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 10, 4, 3, 1, 11, 9 };
		System.out.println(Arrays.toString(arr));
		int start = 0;
		int end = arr.length - 1;
		quickSort(arr, start, end);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		}
		int pivotIndex = getPivotIndex(arr, start, end);
		quickSort(arr, start, pivotIndex - 1);
		quickSort(arr, pivotIndex + 1, end);
	}

	private static int getPivotIndex(int[] arr, int start, int end) {
		int i = start;
		int j = end - 1;
		int pivot = end;
		while (i < j) {
			while (arr[i] < arr[pivot]) {
				i++;
			}
			while (arr[j] > arr[pivot]) {
				j--;
			}
			if (i < j && arr[i] > arr[pivot] && arr[j] < arr[pivot]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i];
		arr[i] = arr[pivot];
		arr[pivot] = temp;
		return i;
	}
}
