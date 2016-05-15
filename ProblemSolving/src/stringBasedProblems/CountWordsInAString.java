package stringBasedProblems;

import java.util.Scanner;

public class CountWordsInAString {

	public static void main(String[] args) {

		// Scanner scan = new Scanner(System.in);
		// System.out.println("enter sentence");
		// String sentence = scan.nextLine();

		// String[] words = sentence.split(" ");
		// System.out.println("Total words: " +words.length);
		String sentence = "  hi";
		
		int count = 0;
		boolean isWordSequence = false;
		for (int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if ((c >= 'a' && c <= 'z') && (!isWordSequence)) {
				isWordSequence = true;
				count++;
			} else if (c == ' ') {
				isWordSequence = false;
			}
		}

		System.out.println("count is: " + (count));
	}
}
