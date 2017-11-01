package com.randomStuff;

public class NumberFormat {

	public static void main(String[] args) {
		 int n = 1000000000;
		// System.out.println(n);

		// System.out.println(String.format("%d", n));
		//
		// System.out.println(String.format("%, d", n));
		//
		// System.out.println(String.format("%,d", n));
		//
		// System.out.println(String.format("%20d", n));

		// System.out.println(String.format("%10d", 100));
		//
		// System.out.println(String.format("%10d", 1000));
		//
		// System.out.println(String.format("%10d", 10));
		//
		// System.out.println(String.format("%10d", 100000));
		
		double f = 534543345.333333533333;
		System.out.println(String.format("The probability of %,d is %,.2f", n, f));
	}
}
