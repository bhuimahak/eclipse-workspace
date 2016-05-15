package com.QueueImplementation;

//using linked list logic
public class Custom_Queue {
	Node head;
	Node tail;

	// enqueue
	public void add(String value) {
		Node n = new Node(value);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n; // or tail = tail.next;
		}
	}

	// dequeue
	public String remove() throws Exception {
		// if queue is empty
		if (head == null) {
			throw new Exception("Queue is empty!");
		}

		// only one element in the Queue
		if (head == tail) {
			String n = head.getValue();
			head = null;
			tail = null;
			return n;
		}

		Node n = head;
		head = head.next;
		n.next = null; // optional
		return n.getValue();
	}

	public void printQueue() {

		if (head == null) {
			System.out.println("Queue is empty!");
			return;
		}
		Node n = head;
		while (n != null) {
			System.out.print(n.getValue() + "--");
			n = n.next;
		}
		System.out.println(" ");
	}

	private class Node {
		String value = null;
		Node next = null;

		private Node(String value) {
			this.value = value;
			this.next = null;
		}

		public String getValue() {
			return this.value;
		}
	}
}
