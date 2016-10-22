package com.randomStuff;

public class SumOfDigitsOfANumber {
	static int n = 2345;

	public static void main(String[] args) throws Exception {
		System.out.println(getSum(n));

	}

	private static int getSum(int n) throws Exception {
		if (n < 0) {
			throw new Exception("Pass a positive number");
		}
		if (n == 0) {
			return 0;
		}
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;

	}

}
