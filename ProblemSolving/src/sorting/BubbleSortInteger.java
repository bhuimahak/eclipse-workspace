package sorting;

import java.util.Arrays;

public class BubbleSortInteger {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 2, 1, 9, 0 };
		BubbleSortInteger obj = new BubbleSortInteger();
		obj.bubbleSort(arr);

	}

	public void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int arraySize = arr.length ;
			for (int j = 0; j < arraySize - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			arraySize--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
