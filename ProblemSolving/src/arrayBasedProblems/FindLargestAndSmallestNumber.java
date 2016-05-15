package arrayBasedProblems;

//FindLargestAndSmallestNumber in an unsorted array

public class FindLargestAndSmallestNumber {

	public static void main(String[] args) {
		int[] arr = { 7, 6, 2, 1, 0, 10, 9 };
		findLargestAndSmallest(arr);
	}

	public static void findLargestAndSmallest(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max is: " + max);
		System.out.println("Min is: " + min);
	}
}
