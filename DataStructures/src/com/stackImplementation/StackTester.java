package com.stackImplementation;

public class StackTester {

	public static void main(String[] args) {
		// Stack stack = new Stack();
		StackUsingArray stack = new StackUsingArray();
		// try {
		// stack.pop();
		//
		// } catch (StackEmptyException e) {
		// System.out.println("Stack is empty!!");
		// e.printStackTrace();
		// }
		try {
			stack.push("Mehak");
			stack.push("Vikram");
			stack.push("Mehd");
			//stack.push("LOL");
		} catch (StackFullException e) {
			System.out.println("Stack is full!");
			e.printStackTrace();
		}
		stack.printStack();
		try {
			stack.pop();
			stack.pop();
			stack.pop();
//			stack.pop();
		} catch (StackEmptyException e) {
			System.out.println("Stack is empty!!");
			e.printStackTrace();
		}
		stack.printStack();
		// stack.push("Arslan");
		// stack.printStack();
		// try {
		// System.out.println("Popped: " + stack.pop());
		// } catch (StackEmptyException e) {
		// e.printStackTrace();
		// }
		// stack.printStack();

	}
}
