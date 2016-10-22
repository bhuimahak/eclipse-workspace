package com.randomStuff;

import java.util.Arrays;

//we have a sorted string having multiple duplicates , create a tring with unique elemennts and append"/0"
public class StringProblem {

	public static void main(String[] args) {
		String s = "aaabbbbccddd";
		char[] arr = s.toCharArray();

		int i = 1, j = 1;
		while (i < arr.length && j < arr.length) {

			if (arr[j] == arr[j - 1]) {
				j++;

			} else {

				arr[i] = arr[j];
				i++;
				j++;
			}

		}
		if (i < arr.length)
			arr[i] = '\0';
		System.out.println(Arrays.toString(arr));

	}

}
