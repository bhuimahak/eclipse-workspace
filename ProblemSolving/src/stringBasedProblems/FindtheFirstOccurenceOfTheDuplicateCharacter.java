package stringBasedProblems;

import java.util.HashMap;
import java.util.Map;

public class FindtheFirstOccurenceOfTheDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbcad"; // output should be : 'a'

		char c = findFirstDuplicateOccurence(s);
		System.out.println("Result is: " + c);
	}

	public static Character findFirstDuplicateOccurence(String s) {
		char[] arr = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (int j = 0; j < s.length(); j++) {
			char ch = s.charAt(j);
			if (map.get(ch) > 1) {
				return ch;
			}
		}
		return null;
	}
}
