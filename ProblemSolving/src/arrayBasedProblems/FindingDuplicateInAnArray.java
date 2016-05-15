package arrayBasedProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindingDuplicateInAnArray {
	int[] arr = new int[] { 4, 6, 11, 3, 6, 1, 8, 11 };
	int length = arr.length;

	public static void main(String[] args) {
		FindingDuplicateInAnArray obj = new FindingDuplicateInAnArray();
		// obj.bruteForce();
		// obj.hashSetOption1();
		// obj.hashSetOption2();
		obj.sortLogic();
	}

	public void bruteForce() {

		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("found duplicate " + arr[i]);
				}
			}
		}
	}

	public void hashSetOption1() {
		// int[] arr = new int[] { 4, 6, 11, 3, 6, 1, 8, 11 };
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < length; i++) {
			if (set.contains(arr[i])) {
				// found
				System.out.println("duplicate is: " + arr[i]);
			} else {
				set.add(arr[i]);
			}
		}
	}

	public void hashSetOption2() {
		Set<Integer> set = new HashSet<>();
		boolean isAdded;
		for (int i = 0; i < length; i++) {
			int key = arr[i];
			isAdded = set.add(key);
			if (!isAdded) {
				System.out.println("duplicate element is : " + key);
			}
		}
	}

	public void sortLogic() {
		Arrays.sort(arr);
		for (int i = 0; i < length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("Duplicate element is : " + arr[i]);
			}
		}
	}
}
