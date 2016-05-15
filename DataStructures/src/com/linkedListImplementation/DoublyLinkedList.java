package com.linkedListImplementation;

public class DoublyLinkedList {

	Node head = null;

	public void add(String value) {
		Node n = new Node(value);
		if (head == null) {
			head = n;
		} else {
			Node node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = n;
			n.previous = node;
		}
	}

	public void addInTheBeginning(String value) {
		Node node = new Node(value);
		node.next = head;
		head.previous = node;
		head = node;
	}

	public void remove(String value) throws LinkedListEmptyException {
		boolean isFound = false;
		if (head == null) {
			throw new LinkedListEmptyException("Doubly linked list is empty!");
		}
		if (head.getValue().equals(value)) {
			isFound = true;
			head = head.next;
			head.previous = null;
		} else {
			Node n = head;
			while (n != null) {
				if (n.getValue().equals(value)) {
					isFound = true;
					n.previous.next = n.next;
					if (n.next != null) {
						n.next.previous = n.previous;
					}
					n.previous = null;
					n.next = null;
				}
			}
		}
		if (!isFound) {
			System.out.println("Element not found in the doubly linked list!");
		}
	}

	private class Node {
		String value;
		Node previous;
		Node next;

		public Node(String value) {
			this.value = value;
			this.next = null;
		}

		public String getValue() {
			return this.value;
		}
	}
}
