package com.linkedListImplementation;

public class CircularDoublyLinkedList {
	private Node head = null;

	public void add(String value) {
		Node n = new Node(value);
		if (head == null) {
			head = n;
			// head.next = head;
			// head.previous
		} else {
			Node last = head.previous;
			last.next = n;
			n.previous = last;
		}
		n.next = head;
		head.previous = n;
	}

	public void remove(String value) throws LinkedListEmptyException {
		if (head == null) {
			throw new LinkedListEmptyException("Linked list is empty!");
		}
		// if the linked list has only one element i.e. head
		if (head.next == head && head.previous == head && head.getValue().equals(value)) {
			head.next = null;
			head.previous = null;
			head = null;
			System.out.println("Linked list is now Empty!");
			return;
		} else if (head.getValue().equals(value)) {
			head.previous.next = head.next;
			head.next.previous = head.previous;
			head = head.next;
		} else {
			Node n = head;
			while (n.next != head) {
				if (n.next.getValue().equals(value)) {
					n.next = n.next.next;
					n.next.next.previous = n;
				}
			}
		}
	}

	private class Node {
		private String value;
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
