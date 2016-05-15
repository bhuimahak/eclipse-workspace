package arrayBasedProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 3, 2, 4, 9, 2 };
		RemoveDuplicatesFromAnArray obj = new RemoveDuplicatesFromAnArray();
		// obj.usingSet(arr);
		// obj.withoutUsingSorting(arr);
		obj.withSorting(arr);
	}

	public void withSorting(int[] arr) {
		Arrays.sort(arr);
		int i = 1;
		for (int j = 1; j < arr.length; j++) {
			if (arr[j - 1] != arr[j]) {
				arr[i] = arr[j];
				i++;
			}
		}
		int[] result = Arrays.copyOf(arr, i);
		System.out.println(Arrays.toString(result));
	}

	public void withoutUsingSorting(int[] a) {
		int noOfUniqueElements = a.length - 1;
		int i = 0;
		int j = i + 1;
		while (i < noOfUniqueElements) {
			while (j < noOfUniqueElements) {
				int k = noOfUniqueElements;
				if (a[i] == a[j]) {
					a[j] = a[k];
					noOfUniqueElements--;
					j--;
				}
			}
		}
		int[] arrayWithoutDuplicates = Arrays.copyOf(a, noOfUniqueElements);
		Arrays.toString(arrayWithoutDuplicates);
	}

	public void usingSet(int[] arr) {
		Set<Integer> set = new LinkedHashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		// converting set to array
		Object[] arrayWithoutDuplicates = set.toArray();
		System.out.println(Arrays.toString(arrayWithoutDuplicates));
	}
}
