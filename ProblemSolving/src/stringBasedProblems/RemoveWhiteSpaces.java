package stringBasedProblems;

import java.util.Arrays;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		RemoveWhiteSpaces obj = new RemoveWhiteSpaces();
		String s = "  I am here";
		obj.whiteSpaceRemoval(s);
		StringBuffer str = new StringBuffer(s);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				str.deleteCharAt(i);
			}
		}
	}

	public void whiteSpaceRemoval(String s) {
		int i = 0;
		int j = 0;
		char[] a = s.toCharArray();
		while (i < a.length && j < a.length) {

			while (i < a.length && a[i] != ' ') {
				i++;
			}
			if (i >= a.length) {
				break;
			}
			if (j < i) {
				j = i;
			}
			while (j < a.length && a[j] == ' ') {
				j++;
			}
			if (j >= a.length) {
				break;
			}
			if (a[i] == ' ' && a[j] != ' ') {
				char temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
