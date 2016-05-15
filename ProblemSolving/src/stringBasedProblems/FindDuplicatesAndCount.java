package stringBasedProblems;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicatesAndCount {
	// Write a java program to find duplicate characters and their count in a
	// given string
	public static void main(String[] args) {
		String str = "Bread Butter";
		FindDuplicatesAndCount obj = new FindDuplicatesAndCount();
		obj.findDuplicates(str);
	}

	public void findDuplicates(String str) {
		str.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		Set<Character> set = map.keySet();
		for (char ch : set) {
			int count = map.get(ch);
			if (count > 1) {
				System.out.println(ch + ": " + count);
			}
		}
	}
}
