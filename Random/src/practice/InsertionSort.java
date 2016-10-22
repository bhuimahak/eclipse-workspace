package practice;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 10, 2, 7, 3, 12, 1 };

		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i-1;
			while (j >= 0) {
				if (a[j] > temp) {
					a[j + 1] = a[j];
				} else {
					break;
				}
				j--;
			}
			a[j + 1] = temp;

		}
		System.out.println(Arrays.toString(a));
	}
}
