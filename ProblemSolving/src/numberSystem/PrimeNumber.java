package numberSystem;

//find if a number is a prime or not
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 8;
		boolean result = checkPrime(number);
		System.out.println("Is Number Prime? " + result);
	}

	public static boolean checkPrime(int number) {
		boolean isPrime = true;
		for (int i = 2; i < (number / 2); i++) {
			if ((number % 2) == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
}
