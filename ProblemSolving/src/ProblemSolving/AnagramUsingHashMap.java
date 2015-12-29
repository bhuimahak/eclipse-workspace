package ProblemSolving;

import java.util.Collection;
import java.util.HashMap;

public class AnagramUsingHashMap {

	public static void main(String[] args) {
		String s1 = "grovvy";
		String s2 = "groovy";
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} 
		else {
			HashMap<Character, Integer> map = new HashMap<>();
			// filling hash map
			for (int i = 0; i < s1.length(); i++) {
				char charAsKey = s1.charAt(i);
				if (map.containsKey(charAsKey)) {
					int charCount = map.get(charAsKey);
					map.put(charAsKey, charCount + 1);
				}
				else {
					map.put(charAsKey, 1);
				}
			}
			System.out.println(map);
			// checkin for anagram

			for (int j = 0; j < s2.length(); j++) {
				char second = s2.charAt(j);
				int charCount;
				if (map.containsKey(second)) {
					charCount = map.get(second);
					map.put(second, charCount - 1);
				} else {
					status = false;
					break;
				}
			}

			System.out.println(map);

			Collection<Integer> collection = map.values();
			for (int i : collection) {
				if (i != 0) {
					status = false;
				}
			}
		}
		if (status) {
			System.out.println("S1 and S2 are anagrams!");
		} else {
			System.out.println("they are not anagrams!");
		}
	}
}
