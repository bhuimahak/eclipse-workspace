package stringBasedProblems;

import java.util.Arrays;

//To remove duplicates from a sorted char array and append '/0' in the end using only one loop

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "aaaaaaabbbbccdd";
		char[] arr = s.toCharArray();
		removeDuplicates(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void removeDuplicates(char[] arr) {
		int length = arr.length;
		if (length == 1 || length == 0) {
			System.out.println("No duplicates");
			return;
		}
		int i = 1;
		for (int j = 1; j < length; j++) {
			if (arr[j] != arr[j - 1]) {
				arr[i] = arr[j];
				i++;
			}
		}
		if (i < length) {
			arr[i] = '\0';
		}
	}
}
