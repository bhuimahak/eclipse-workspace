package com.randomStuff;
//to check if th number is a palindrome

//Also check reversing a number

public class CheckIfNumberisPalindrome {
	static int given = 434;

	public static void main(String[] args) {
		System.out.println(checkPalindrome(given));

	}

	private static boolean checkPalindrome(int n) {
		boolean isPalindrome= false;
		int d, sum = 0;
		while (n > 0) {
			d = n % 10; // this will give the last digit of the number
			sum = sum * 10 + d;
			n = n / 10; // this will drop the last digit from the mumber
		}
		System.out.println("Reversed number is: "+ sum);
	
		if(sum == given){
			isPalindrome = true;
		}
		return isPalindrome;
	}

}
