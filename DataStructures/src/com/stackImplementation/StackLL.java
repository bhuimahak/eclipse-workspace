package com.stackImplementation;

//Stack implementation using Linked_List
public class StackLL {
	private Node top = null;

	public boolean isEmpty(){
		if(top == null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void push(String value) {
		Node newNode = new Node(value);
		if (top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}

	public String pop() throws StackEmptyException {
		if (top == null) {
			throw new StackEmptyException("Stack empty exception!");
		}
		Node node = top;
		top = top.next;
		node.next = null; // This is optional
		return node.getValue();
	}

	public String peek() throws StackEmptyException {
		if (top == null) {
			throw new StackEmptyException("Stack empty exception!");
		}
		return top.getValue();
	}

	public void printStack() {
		if (top == null) {
			System.out.print("Stack is empty");
		}
		System.out.print("Stack: ");
		Node n = top;
		while (n != null) {
			System.out.print(n.getValue() + " -- ");
			n = n.next;
		}
		System.out.println(" ");
	}

	public class Node {
		String data;
		Node next;

		public Node(String data) {
			this.data = data;
			this.next = null;
		}

		public String getValue() {
			return this.data;
		}
	}
}
