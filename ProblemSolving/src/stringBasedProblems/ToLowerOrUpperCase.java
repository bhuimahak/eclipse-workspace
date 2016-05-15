package stringBasedProblems;

import java.util.Arrays;

public class ToLowerOrUpperCase {

	public static void main(String[] args) {
		// String a = "AZBF";
		// toLowercase(a);
		String b = "aybf";
		toUpperCase(b);
	}

	public static String toUpperCase(String b) {
		char[] arr = b.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (c >= 'a' && c <= 'z') {
				arr[i] = (char) (c - 'a' + 'A');
			}
		}
		String result = new String(arr);
		System.out.println("Resultant String is " + result);
		return result;
	}

	public static String toLowercase(String a) {
		char[] arr = a.toCharArray();
		for (int j = 0; j < arr.length; j++) {
			char c = arr[j];
			if (c >= 'A' && c <= 'Z') {
				arr[j] = (char) (c - 'A' + 'a');
			}
		}
		String result = new String(arr);
		System.out.println("Resultant String is " + result);
		return result;
	}
}
