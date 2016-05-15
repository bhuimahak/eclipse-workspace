package arrayBasedProblems;

import java.util.Arrays;

public class ZeroesAndOnes {

	public static void main(String[] args) {
		// to arrange a array in which all 0s are on left and all 1s are on the
		// right

		int[] a = { 0, 0, 1, 0, 1, 0, 0, 1 };

		int i = 0;
		int j = a.length - 1;

		while (i < j) {

			if ((a[i] == 1) && (a[j] == 0)) {
				a[i] = 0;
				a[j] = 1;
			}

			if (a[i] == 0) {
				i++;
			}
			if (a[j] == 1) {
				j--;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
