package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 14, 33, 27, 10, 35, 19, 42, 44 };
		insertionSort(arr);
	}

	public static void insertionSort(int[] arr) {
		// int i = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > temp) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
