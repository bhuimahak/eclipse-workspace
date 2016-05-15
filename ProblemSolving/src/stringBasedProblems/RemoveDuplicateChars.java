package stringBasedProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String s = "aabbccdd"; // output required: abcd
		RemoveDuplicateChars obj = new RemoveDuplicateChars();
		obj.stringBuffer(s);
		// obj.listLogic(s);

	}

	public void stringBuffer(String s) {
		StringBuffer str = new StringBuffer();
		char[] a = s.toCharArray();
		Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				str.append(a[i]);
			}
		}
		System.out.println(str);
	}

	public void listLogic(String s) {

		List<Character> l = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!(l.contains(c))) {
				l.add(c);
			}
		}
		for (char k : l) {
			System.out.print(k);
		}
	}
}
