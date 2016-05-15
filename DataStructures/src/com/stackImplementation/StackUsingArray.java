package com.stackImplementation;

public class StackUsingArray {
	String[] arr = new String[3];
	int top = -1;

	public void push(String value) throws StackFullException {
		if (top == -1) {
			top++;
			arr[top] = value;
			return;
		}
		if (top == arr.length - 1) {
			// System.out.println("Stack is full!");
			throw new StackFullException("here Stack is full");
		}
		top++;
		arr[top] = value;
	}

	public String pop() throws StackEmptyException {
		if (top == -1) {
			throw new StackEmptyException("Stack is empty!");
		}
		String temp = arr[top];
		top--;
		return temp;
	}

	public String peek() throws StackEmptyException {
		if (top == -1) {
			throw new StackEmptyException("Stack is empty!");
		} else {
			return arr[top];
		}
	}

	public void printStack() {
		System.out.print("Stack: ");
		if (top == -1) {
			System.out.println("In print method, empty stack!!");
		}
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + "--");
		}
		System.out.println(" ");
	}
}
