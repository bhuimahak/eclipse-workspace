package stringBasedProblems;

import java.util.HashMap;
import java.util.Map;

// input = "swiss" output = w
public class FindFirstNonRepeatedChar {

	public static void main(String[] args) {
		String s = "SwIss";
		char result = findFirstNonRepeated(s);
		System.out.println("FirstNonRepeatedChar is: " + result);
	}

	private static Character findFirstNonRepeated(String s) {
		s = s.toLowerCase();

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.get(ch) == 1) {
				return ch;
			}
		}
		return null;
	}
}
