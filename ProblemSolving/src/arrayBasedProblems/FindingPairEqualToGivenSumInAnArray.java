package arrayBasedProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindingPairEqualToGivenSumInAnArray {
	int[] arr = new int[] { 4, 6, 2, 3, 1, 8, 11 };
	int givenSum = 10;

	public static void main(String[] args) {
		FindingPairEqualToGivenSumInAnArray obj1 = new FindingPairEqualToGivenSumInAnArray();
		obj1.sortLogic();
		obj1.hashSetLogic();

	}

	public void sortLogic() {
		// logic 1
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int sum = arr[i] + arr[j];
			if (sum == givenSum) {
				System.out.println("Pair is: " + arr[i] + " and " + arr[j]);
				i++;
				j--;

			} else if (sum < givenSum) {
				// System.out.println("in here");
				i++;

			} else if (sum > givenSum) {
				// System.out.println("sum more than given");
				j--;
			}
		}
	}

	public void hashSetLogic() {
		// logic 2
		Set<Integer> set = new HashSet<>();
		for (int k = 0; k < arr.length; k++) {
			int diff = givenSum - arr[k];
			set.add(diff);
		}
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				System.out.println("Pair is " + arr[i] + " and " + (givenSum - arr[i]));
			}
		}
	}
}
