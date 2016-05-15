package stringBasedProblems;

import java.util.Stack;

public class Expression {

	public static void main(String[] args) {
		String s = "[{(+}]";
		try {
			System.out.println(checkIfBalanced(s));
		} catch (Exception e) {
			System.out.println("Invalid String");
			e.printStackTrace();
		}
	}

	public static boolean checkIfBalanced(String s) throws Exception {
		if (s == null) {
			throw new Exception("Please pass a valid string");
		}
		boolean isBalanced = true;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				char charOntopOfStack = stack.pop();
				if (!isOpenCloseMatching(charOntopOfStack, c)) {
					isBalanced = false;
					break;
				}
			}
		}
		return isBalanced;
	}

	public static boolean isOpenCloseMatching(char open, char close) {
		boolean isMatching = false;
		if (open == '(' && close == ')') {
			isMatching = true;
		}
		if (open == '{' && close == '}') {
			isMatching = true;
		}
		if (open == '[' && close == ']') {
			isMatching = true;
		}
		return isMatching;
	}
}
