package arrayBasedProblems;

public class FindingSecondMaxInAnArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 6, 11, 3, 6, 1, 8, 11 };
		int length = arr.length;
		int max = Integer.MIN_VALUE;
		int secondMax = -15000;

		for (int i = 0; i < length; i++) {
			if (arr[i] > max) {
				
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && (arr[i] != max)) {
				secondMax = arr[i];
			}
		}
		System.out.println("Max is: " + max + "and second max is: " + secondMax);

	}

}
