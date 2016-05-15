package toughArrayProblems;

public class findMaxSumSubArray {
	// to find a sub array whose sum is maximum

	public static void main(String[] args) {
		int[] arr = { -1, -2, -3, 9, -2, 4, 13, -9, -1 };
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int currentIndex = 0;
		int maxSumStartIndex = -1;
		int maxEndIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			currentSum = currentSum + arr[i];
			if (currentSum <= 0) {
				currentSum = 0;
				currentIndex = i + 1;
			}
			else {
				if (currentSum > maxSum) {
					maxSum = currentSum;
					maxSumStartIndex = currentIndex;
					maxEndIndex = i;
				}
			}
		}
		System.out.println("maxSumStartIndex: " + maxSumStartIndex + " maxSum: " + maxSum);		
		for(int k = maxSumStartIndex; k <= maxEndIndex; k++) {
			System.out.print(arr[k] + ", ");
		}
	}
}
