package linkedListProblems;

import java.util.ArrayList;
import java.util.List;

public class CircularLinkedList {
	Node head = null;

	public void add(String value) {
		Node n = new Node(value);
		if (head == null) {
			head = n;
		} else {
			Node node = head;
			while (node.next != head) {
				node = node.next;
			}
			node.next = n;
		}
		n.next = head;
	}

	public void remove(String value) throws LinkedListEmptyException {
		if (head == null) {
			throw new LinkedListEmptyException("Linked list is empty!");
		}
		Node n = head;
		while (n.next != head) {
			if (n.next.getValue().equals(value)) {
				n.next = n.next.next;
				return;
			}
			n = n.next;
		}
		if (n.next == head) {
			if (head.getValue().equals(value)) {
				n.next = head.next;
				head = head.next;
			}
		}
	}

	private class Node {
		String value;
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
