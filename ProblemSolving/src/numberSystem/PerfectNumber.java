package numberSystem;

//find that the given number is a perfect number or not
//perfect number is the one in which sum of all the divisors including 1 and except the number is equal to the number itself

public class PerfectNumber {

	public static void main(String[] args) {
		int givenNumber = 6;
		boolean result = checkPerfectNumber(givenNumber);
		System.out.println("Is Perfect? " + result);
	}

	public static boolean checkPerfectNumber(int n) {
		boolean isPerfect = false;
		int sum = 1;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			isPerfect = true;
		}
		return isPerfect;
	}
}
