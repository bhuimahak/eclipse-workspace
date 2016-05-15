package stringBasedProblems;

import java.util.HashMap;
import java.util.Set;

//find duplicate words in a string and its count
public class DuplicateWords {

	public static void main(String[] args) {

		String sentence = "Super man Man ";
		HashMap<String, Integer> map = new HashMap<>();
		String s = "f;f";
		s.split(";");
		String[] arr = sentence.split(" ");

		for (String word : arr) {
			word = word.toLowerCase();
			if (map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, count + 1);
			} else {
				map.put(word, 1);
			}
		}

		Set<String> keys = map.keySet();
		boolean foundDuplicate = false;
		for (String key : keys) {
			int count = map.get(key);
			if (count > 1) {
				foundDuplicate = true;
				System.out.println(key + ": " + count);
			}
		}
		if (!foundDuplicate) {
			System.out.println("No duplicate words!");
		}
	}
}
