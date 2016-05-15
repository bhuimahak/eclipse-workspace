package StackandQueueBasedProblems;

import java.util.Stack;

public class StackReversal {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		printStack(stack);
		System.out.println("");
		stackReversal(stack);
		printStack(stack);

	}

	public static void printStack(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int val = stack.pop();
		System.out.print(val + "--");
		printStack(stack);
		stack.push(val);

	}

	public static void stackReversal(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int value = stack.pop();
		stackReversal(stack);
		addAtTheBottom(stack, value);

	}

	public static void addAtTheBottom(Stack<Integer> stack, int value) {
		if (stack.isEmpty()) {
			stack.push(value);
			return;
		}
		int val = stack.pop();
		addAtTheBottom(stack, value);
		stack.push(val);
	}
}
