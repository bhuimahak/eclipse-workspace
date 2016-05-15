package stringBasedProblems;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//to verify if two strings are anagram
public class Anagram {

	public static void main(String[] args) {
		String s = "widj";
		String t = "jwi";

		System.out.println(checkAnagram(s, t));

	}

	private static boolean checkAnagram(String s, String t) {
		boolean isAnagram = true;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, count + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (int j = 0; j < t.length(); j++) {
			char ch = t.charAt(j);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) - 1);
			}
		}

		Collection<Integer> values = map.values();
		for (int i : values) {
			if (i != 0) {
				isAnagram = false;
				break;
			}
		}
		return isAnagram;
	}
}
