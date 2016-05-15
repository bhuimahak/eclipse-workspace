package stringBasedProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		String s = "The quick brown fox jumped over the lazy sleeping dog.";
		Pangram obj = new Pangram();
		// System.out.println("Result: " + obj.checkPangram(s));
		System.out.println("Result: " + obj.checkPangramWithoutUsingSet(s));

	}

	private boolean checkPangramWithoutUsingSet(String str) {
		boolean isPangram = true;
		int[] arr = new int[26];
		str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				int index = c - 'a';
				System.out.println("index: " + index);
				arr[index]++;
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 0) {
				isPangram = false;
				break;
			}
		}
		return isPangram;
	}

	private boolean checkPangram(String s) {
		Set<Character> set = new LinkedHashSet<>();
		boolean isPangram = true;
		Map<Integer, Integer> map = new HashMap<>();
		for (int j = 0; j < s.length(); j++) {
			set.add(s.charAt(j));
		}
		System.out.println("Set is: " + set);

		for (char c = 'a'; c <= 'z'; c++) {
			if (!set.contains(c)) {
				isPangram = false;
				break;
			}
		}
		return isPangram;
	}
}
