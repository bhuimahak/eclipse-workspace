package numberSystem;

public class FindSumOfNumberDigits {

	public static void main(String[] args) {
		int number = 12345;
		add(number);
	}

	private static void add(int number) {
		int sum = 0;
		while (number != 0) {
			int lastDigit = number % 10;
			sum = sum + lastDigit;
			number = number / 10;
		}
		System.out.println("Sum of the digits is:" + sum);
	}
}
