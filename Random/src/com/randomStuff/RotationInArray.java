package com.randomStuff;

import java.util.Arrays;

public class RotationInArray {
	static int order = 3;
	static char[] arr = { 'a', 'b', 'c', 'd', 'e' };

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(rotate(order)));

	}

	private static char[] rotate(int order) {
		for (int i = 0; i < order; i++) {

			int j = arr.length - 1;
			char temp = arr[j];
			for (j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = temp;
		}
		return arr;
	}
}
