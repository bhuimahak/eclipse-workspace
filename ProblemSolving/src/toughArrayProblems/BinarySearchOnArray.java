package toughArrayProblems;

// An array has a property that its first increasing and then it starts decreasing, find the point of change or the max element
public class BinarySearchOnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 13, 10, 8, 2 };
		findChangingPoint(arr);

	}

	public static Integer findChangingPoint(int[] arr) {
		// implementing binary search algorithm
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			int mid = (i + j) / 2;
			if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
				return arr[mid];
			} else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
				i = mid + 1;
			} else {
				j = mid - 1;
			}
		}
		return null;
	}

}
