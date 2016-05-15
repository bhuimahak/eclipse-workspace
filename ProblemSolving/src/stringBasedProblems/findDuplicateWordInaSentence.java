package stringBasedProblems;

import java.util.HashSet;

//using HashSet
public class findDuplicateWordInaSentence {

	public static void main(String[] args) {
		String sentence = "Super man super";
		findDuplicateWordInaSentence obj = new findDuplicateWordInaSentence();
		String s = obj.duplicateWord(sentence);
		if (s != null) {
			System.out.println("Duplicate word is: " + s);
		} else
			System.out.println("Duplicates doesnt exist");
	}

	public String duplicateWord(String sentence) {

		String duplicate = null;
		String[] words = sentence.split(" ");
		HashSet<String> wordSet = new HashSet<>();
		for (int i = 0; i < words.length; i++) {
			String word = words[i].toLowerCase();
			boolean isAdded = wordSet.add(word);
			if (!isAdded) {
				duplicate = word;
			}
		}
		// for (String word : words) {
		// word = word.toLowerCase();
		// boolean isAdded = wordSet.add(word);
		// if (!isAdded) {
		// duplicate = word;
		// }
		// }
		return duplicate;
	}
}
