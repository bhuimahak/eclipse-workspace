package arrayBasedProblems;

import java.util.HashSet;
import java.util.Set;

public class FindingCommonElementsInTwoArrays {
	int[] a = { 4, 6, 11, 3, 1, 8 };
	int[] b = { 9, 2, 3, 0, 4 };

	public static void main(String[] args) {
		FindingCommonElementsInTwoArrays obj = new FindingCommonElementsInTwoArrays();
		// obj.bruteForce();
		obj.hashSetLogic();
	}

	public void bruteForce() {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					set.add(a[i]);
				}
			}
		}
		System.out.println(set);
	}

	public void hashSetLogic() {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (int j = 0; j < b.length; j++) {
			if (set.contains(b[j])) {
				// found common
				System.out.println("common element is :" + b[j]);
			}
		}
	}
}
