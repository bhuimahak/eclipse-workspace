package toughArrayProblems;

public class FindingLongestSequenceOfNegativesInanArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, -1, -2, -3, 5, 6, -7, -8, 22, -12, -13, -14, -15 };
		// findLongestNegativeSequence(arr);
		findLongestPositiveSequence(arr);
	}

	private static void findLongestPositiveSequence(int[] arr) {
		int currentIndex = -1;
		boolean isPositiveSequence = false;
		int maxCount = Integer.MIN_VALUE;
		int maxStartIndex = -1;
		int currentCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				if (isPositiveSequence == true) {
					currentCount++;
				} else {
					isPositiveSequence = true;
					currentCount = 1;
					currentIndex = i;
				}
			} else {
				isPositiveSequence = false;
				if (currentCount > maxCount) {
					maxCount = currentCount;
					maxStartIndex = currentIndex;
				}
			}
		}
		for (int j = maxStartIndex; j < maxStartIndex + maxCount; j++) {
			System.out.print(arr[j] + ", ");
		}
	}

	private static void findLongestNegativeSequence(int[] arr) {
		int maxCount = Integer.MIN_VALUE;
		int count = 0;
		int negativeStartIndex = -1;
		int maxstartIndex = -1;
		int i = 0;
		while (i < arr.length) {
			count = 0;
			if (arr[i] < 0) {
				negativeStartIndex = i;
				while (i < arr.length && arr[i] < 0) {
					count++;
					i++;
				}
				if (maxCount < count) {
					maxCount = count;
					maxstartIndex = negativeStartIndex;
				}
			} else {
				i++;
			}
		}
		System.out.println("Max count: " + maxCount);
		if (maxstartIndex != -1) {
			for (int j = maxstartIndex; j < maxstartIndex + maxCount; j++) {
				System.out.print(arr[j] + ", ");
			}
		}
	}
}
