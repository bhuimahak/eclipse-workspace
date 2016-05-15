package stringBasedProblems;

import java.util.Arrays;

public class StringReversal {

	public static void main(String[] args) {
		String s = "Hello hi";
		char[] a = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;

		while (i <= j) {
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}
}
