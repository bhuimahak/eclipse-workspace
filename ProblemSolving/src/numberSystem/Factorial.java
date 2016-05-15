package numberSystem;

public class Factorial {

	public static void main(String[] args) {
		int number = 5;
		int fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
	}

	private static int factorial(int number) {
		if (number == 0) {
			return 0;
		}
		if (number == 1) {
			return 1;
		}
		int factorial = number * factorial(number - 1);
		return factorial;
	}
}
