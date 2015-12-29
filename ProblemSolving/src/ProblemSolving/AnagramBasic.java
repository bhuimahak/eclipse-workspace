package ProblemSolving;

public class AnagramBasic {

	public static void main(String[] args) {
		boolean status = true;
		String s1 = "groovy";
		StringBuilder s2 = new StringBuilder("grovy");
		char[] s1arr = s1.toCharArray();

		for (char c : s1arr) {
			int index = s2.indexOf("" + c);
			if (index != -1) {
				// character is present in the second string, so removing it
				s2.deleteCharAt(index);
			} else {
				// If not present, setting status as false and breaking the loop
				status = false;
				break;
			}

		}

		if (status) {
			System.out.println("they are anagrams!");
		} else {
			System.out.println("They are not anagrams!");
		}

	}
}
