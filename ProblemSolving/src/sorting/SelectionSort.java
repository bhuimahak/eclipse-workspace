package sorting;

import java.util.Arrays;

//The selection sort works as follows: you look through the entire array for the smallest element, 
//once you find it you swap it (the smallest element) with the first element of the array. 
//Then you look for the smallest element in the remaining array (an array without the first 
//element) and swap it with the second element. Then you look for the smallest element in the 
//remaining array (an array without first and second elements) and swap it with the third element, and so on.

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 1, 0, 3 };
		SelectionSort obj = new SelectionSort();
		obj.selectionSort(arr);
	}

	public void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
