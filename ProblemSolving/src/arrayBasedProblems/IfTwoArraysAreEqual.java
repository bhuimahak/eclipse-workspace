package arrayBasedProblems;

public class IfTwoArraysAreEqual {
	// Two arrays are said to be equal if the arrays have equal number of
	// elements and all corresponding pairs of elements in two arrays are equal.

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8 };
		int[] arr2 = { 2, 6, 4, 8 };
		boolean isEqual = true;

		if (arr1.length == arr2.length) {
			int length = arr1.length;
			for (int i = 0; i < length; i++) {
				if (arr1[i] != arr2[i]) {
					isEqual = false;
					break;
				}
			}

			if (isEqual) {
				System.out.println("Arrays are equal");
			} else {
				System.out.println("Arrays are not equal");
			}

		} else {
			System.out.println("Array lengths are not equal");
		}
	}
}
