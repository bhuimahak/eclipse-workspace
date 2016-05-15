package arrayBasedProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonElementsFromThreeArrays {

	public static void main(String[] args) {
		int[] a = { 1, 5, 10, 20, 40, 80 };
		int[] b = { 6, 7, 20, 80, 100 };
		int[] c = { 3, 4, 15, 20, 30, 70, 80, 120 };
		findCommonElements(a, b, c);
}

	public static void findCommonElements(int[] a, int[] b, int[] c) {
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (int j = 0; j < b.length; j++) {
			if (!set.contains(b[j])) {
				set.remove(b[j]);
			}
		}
		for (int k = 0; k < c.length; k++) {
			if (set.contains(c[k])) {
				list.add(c[k]);
			}
		}
		for (int common : list) {
			System.out.print(common + ", ");
		}
	}
}
