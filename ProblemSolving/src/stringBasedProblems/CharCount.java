package stringBasedProblems;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CharCount {
	// How To Count Occurrences Of Each Character In String In Java?

	public static void main(String[] args) {
		String s = "JavaJ2EE";
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, (map.get(c)) + 1);
			} else {
				map.put(c, 1);
			}
		}

		// Set<Character> keys = map.keySet();
		// for (Character c : keys) {
		// int count = map.get(c);
		// System.out.println(c + ": " + count);
		// }
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry e : entrySet) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
}
