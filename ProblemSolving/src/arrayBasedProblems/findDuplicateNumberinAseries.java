package arrayBasedProblems;

public class findDuplicateNumberinAseries {
	// An array contains n numbers ranging from 0 to n-2. There is exactly one
	// number is repeated in the array. You need to write a program to find that
	// duplicate number. For example, if an array with length 6 contains numbers
	// {0, 3, 1, 2, 3}, then duplicated number is 3.

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 3 };
		findDuplicate(arr, 3);
	}

	private static void findDuplicate(int[] arr, int given) {
		int ExpectedSum = 0;
		for (int i = 0; i <= 3; i++) {
			ExpectedSum = ExpectedSum + i;
		}
		int actualSum = 0;
		for (int j = 0; j < arr.length; j++) {
			actualSum = actualSum + arr[j];
		}
		int duplicate = actualSum - ExpectedSum;
		System.out.println("Duplicate number is: " + duplicate);
	}
}
