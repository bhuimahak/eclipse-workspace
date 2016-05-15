package arrayBasedProblems;

public class findKthSmallestNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 10, 9, 4 };
		int k = 2;
		// int result = find Kth Smallest Number(arr, k);
		// System.out.println("Kth Smallest Number: " + result);
		System.out.println("Kth Largest Number: " + findKthLargestNumber(arr, k));
	}

	private static Integer findKthLargestNumber(int[] arr, int k) {
		Integer requiredNumber = null;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					count++;
				}
			}
			if (count == (k - 1)) {
				requiredNumber = arr[i];
				break;
			}
		}
		return requiredNumber;
	}

	public static int findKthSmallestNumber(int[] arr, int k) {
		Integer requiredNumber = null;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					count++;
				}
			}
			if (count == (k - 1)) {
				requiredNumber = arr[i];
				break;
			}
		}
		return requiredNumber;
	}
}
