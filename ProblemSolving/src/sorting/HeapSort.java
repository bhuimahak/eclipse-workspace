package sorting;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr = { 10, 13, 4, 3, 9, 1 };
		HeapSort obj = new HeapSort();
		obj.heapSort(arr);
		System.out.println("sorted: " + Arrays.toString(arr));
	}

	private void heapSort(int[] arr) {
		System.out.println("original: " + Arrays.toString(arr));
		buildHeap(arr);
		System.out.println("heap: " + Arrays.toString(arr));
		int heapsize = arr.length - 1;

		while (heapsize > 0) {
			int temp = arr[heapsize];
			arr[heapsize] = arr[0];
			arr[0] = temp;
			heapsize--;
			heapify(arr, 0, heapsize);
		}
	}

	public void heapify(int[] arr, int parentIndex, int heapsize) {
		int left = 2 * parentIndex + 1;
		int right = 2 * parentIndex + 2;
		if (right > heapsize) {
			if (left > heapsize) {
				return;
			}
			if (arr[left] > arr[parentIndex]) {
				int temp = arr[parentIndex];
				arr[parentIndex] = arr[left];
				arr[left] = temp;
			}
		} else {
			int max = left;
			if (arr[right] > arr[left]) {
				max = right;
			}
			if (arr[max] > arr[parentIndex]) {
				int temp = arr[parentIndex];
				arr[parentIndex] = arr[max];
				arr[max] = temp;
				heapify(arr, max, heapsize);
			}
		}
	}

	private void buildHeap(int[] arr) {
		int lastElementIndex = arr.length - 1;
		int parent = (lastElementIndex - 1) / 2;
		for (int k = parent; k >= 0; k--) {
			heapify(arr, k, lastElementIndex);
		}
	}

	public void swap(int[] arr, int index, int other) {
		int temp = arr[other];
		arr[other] = arr[index];
		arr[index] = temp;
	}
}
