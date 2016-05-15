package stringBasedProblems;

public class OccurencesOfACharInAString {
	// find the occurence of a given char in a string i.e. no. of times its
	// appearing in a string.

	public static void main(String args[]) {
		String s = "aagain";
		char givenChar = 'a';
		OccurencesOfACharInAString obj = new OccurencesOfACharInAString();
		// obj.simple(s, givenChar);
		System.out.println("Count is " + obj.recursivee(s, givenChar, 0));

		// int countOfChar = count(s, givenChar, 0, 1);
		// System.out.println("a occurs " + countOfChar + " times");
	}

	public static int count(String s, char c, int index, int tot) {
		if (index == s.length())
			return tot;
		else if (c == s.charAt(index)) {
			tot++;
		}
		return count(s, c, ++index, tot);
	}

	public int recursive(String s, char c, int count, int index) {
		if (index == s.length()) {
			return count;
		} else if (s.charAt(index) == c) {
			count++;
		}
		int total = recursive(s, c, count, index + 1);

		return total;
	}

	public int recursivee(String s, char c, int index) {
		if (index == s.length()) {
			return 0;
		}
		int count = recursivee(s, c, index + 1);
		if (s.charAt(index) == c) {
			count++;
		}
		return count;
	}

	public void simple(String s, char givenChar) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == givenChar) {
				count++;
			}
		}
		System.out.println("count is: " + count);
	}

}
