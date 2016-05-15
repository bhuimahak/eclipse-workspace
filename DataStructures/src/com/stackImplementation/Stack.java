package com.stackImplementation;

import com.linkedListImplementation.LinkedListEmptyException;
import com.linkedListImplementation.Linked_List;

//Stack implementation using Linked_List
public class Stack {
	private Linked_List list = null;

	public Stack() {
		list = new Linked_List();
	}

	public void push(String value) {
		list.addAtTheBeginning(value);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}

	public String pop() throws StackEmptyException {
		if (list.isEmpty()) {
			throw new StackEmptyException("Stack empty exception!");
		}
		String element;
		try {
			element = list.removeFirstElement();
		} catch (LinkedListEmptyException e) {
			throw new StackEmptyException("Stack empty exception!");
		}
		return element;
	}

	public String peek() throws StackEmptyException {
		String firstElement;
		try {
			firstElement = list.getFirstElement();
		} catch (LinkedListEmptyException e) {
			throw new StackEmptyException("Stack empty exception!");
		}
		return firstElement;
	}

	public void printStack() {
		System.out.print("Stack: ");
		try {
			list.printLinkedList();
		} catch (LinkedListEmptyException e) {
			System.out.println("Stack is Empty.");
		}
	}
}
