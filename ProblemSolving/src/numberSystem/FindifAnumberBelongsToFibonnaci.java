package numberSystem;

public class FindifAnumberBelongsToFibonnaci {

	public static void main(String[] args) {
		int givenNumber = 20;
		// System.out.println(findIfFibonnaci(givenNumber));
		// Also check fib using recursive
		System.out.println(findIfFibUsingRecursive(givenNumber));
	}

	private static boolean findIfFibonnaci(int givenNumber) {
		boolean isFib = false;
		if (givenNumber == 0) {
			isFib = true;
		} else if (givenNumber == 1) {
			isFib = true;
		} else {
			int n1 = 0;
			int n2 = 1;
			int n3 = n1 + n2;
			while (n3 <= givenNumber) {
				if (givenNumber == n3) {
					isFib = true;
					break;
				}
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			}
		}
		return isFib;
	}

	private static boolean findIfFibUsingRecursive(int givenNumber) {
		boolean isFib = false;
		int fibValue = 0;
		int i = 0;
		while (fibValue <= givenNumber) {
			fibValue = fibb(i);
			if (fibValue == givenNumber) {
				isFib = true;
				break;
			}
			i++;
		}
		return isFib;
	}

	private static int fibb(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int fibonnaci = fibb(n - 1) + fibb(n - 2);
		return fibonnaci;
	}
}
