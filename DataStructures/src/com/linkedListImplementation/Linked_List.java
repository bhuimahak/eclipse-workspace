package com.linkedListImplementation;

public class Linked_List {
	private Node head = null;
	private Node tail = null;

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	public void addAtTheEnd(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void addAtTheBeginning(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void printLinkedList() throws LinkedListEmptyException {
		if (head == null || tail == null) {
			throw new LinkedListEmptyException("List is empty");
		}
		Node n = head;
		while (n != null) {
			System.out.print(n.getValue() + "--");
			n = n.next;
		}
		System.out.println(" ");
	}

	public void printLinkedListRecursive() {
		System.out.print("list : ");
		printLinkedListRec(head);
	}

	private void printLinkedListRec(Node node) {
		if (node == null) {
			System.out.println("null");
			return;
		}
		System.out.print(node.getValue() + "-->");
		printLinkedListRec(node.next);
	}

	public void printReverseLinkedList() {
		printLinkedListInReverse(head);
	}

	private void printLinkedListInReverse(Node node) {
		if (node == null) {
			return;
		}
		printLinkedListInReverse(node.next);
		System.out.print(node.getValue() + "--");
	}

	public String removeFirstElement() throws LinkedListEmptyException {
		if (head == null) {
			throw new LinkedListEmptyException("Linked list is empty!");
		}
		if (head == tail) {
			Node node = head;
			head = null;
			tail = null;
			return node.getValue();
		}
		Node node = head;
		head = head.next;
		node.next = null; // This is optional
		return node.getValue();
	}

	public String getFirstElement() throws LinkedListEmptyException {
		if (head == null) {
			throw new LinkedListEmptyException("Linked list is empty!");
		}
		return head.getValue();
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
