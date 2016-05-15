package stringBasedProblems;

public class SimpleExpressionBalancingProgram {

	public static void main(String[] args) {
		String s = "(4+2 +1*(4+x))";
		boolean result = isBalanced(s);
		System.out.println("Is Expression balanced? " + result);
	}

	public static boolean isBalanced(String s) {
		boolean isBalanced = true;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				count = count + 1;
			} else if (c == ')') {
				count = count - 1;
			}
			if (count < 0) {
				isBalanced = false;
				break;
			}
		}
		if (count > 0) {
			isBalanced = false;
		}
		return isBalanced;
	}
}
