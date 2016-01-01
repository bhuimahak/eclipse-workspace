package generics.sorting;

import java.util.Comparator;

public class BubbleSort {

	public static <T extends Comparable<T>> void bubbleSort(T[] a) {
		int arrayLength = a.length;
		for (int k = arrayLength; k > 1; k--) { // k is equal to arrayLength
			for (int i = 0; i < k - 1; i++) {
				int j = i + 1;
				if ((a[i].compareTo(a[j])) > 0) {
					// Swap
					T temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
				j++;
			}
		}
	}

	public static void bubbleSort(Integer[] a) {
		int arrayLength = a.length;
		for (int k = arrayLength; k > 1; k--) { // k is equal to arrayLength
			for (int i = 0; i < k - 1; i++) {
				int j = i + 1;
				if (a[i] > a[j]) {
					// swap
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
				j++;
			}
			// arrayLength = arrayLength - 1;
		}
	}
	public static <T> void bubbleSort(T[] a, Comparator<T> c) {
		int arrayLength = a.length;
		for (int k = arrayLength; k > 1; k--) { // k is equal to arrayLength
			for (int i = 0; i < k - 1; i++) {
				int j = i + 1;
				if ((c.compare(a[i], a[j])) > 0) {
					// Swap
					T temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
				j++;
			}
		}
	}


}
