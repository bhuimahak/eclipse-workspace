package toughArrayProblems;

// in a sorted array find a number 'k' in  minimum comparisons ie order of O(klogN)
public class InfinteSizeArray {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 4, 8, 9, 10, 16, 18, 20, 22, 25, 30, 36, 40, 45, 56, 77, 89, 92 };
		int k = 25;
		int i = 0;
		int j = i;
		int totalJumps = 0;
		while (a[i] < k) {
			j = i;
			i = 2 * i + 1;
			totalJumps++;
		}
		if (a[i] == k) {
			System.out.println("here");
			System.out.println("Element found at position : " + i);
		} else if (a[i] > k) {
			for (int x = j; x < i; x++) {
				if (a[x] == k) {
					System.out.println("in here");
					System.out.println("Element found at position : " + x);
					totalJumps++;
					break;
				}
			}
		}
		System.out.println("Total jumps: " + totalJumps);
	}
}
