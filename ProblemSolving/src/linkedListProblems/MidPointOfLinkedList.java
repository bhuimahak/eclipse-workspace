package linkedListProblems;

import linkedListProblems.LinkedListReversal.Node;

public class MidPointOfLinkedList {

	public static void main(String[] args) {

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		// Node n7 = new Node(7);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		// n6.next = n7;
		MidPointOfLinkedList obj = new MidPointOfLinkedList();
		// int value = obj.midElement(n1);
		int value = obj.midPoint_using_FastnSlowPointer(n1);
		System.out.println("Mid element: " + value);
	}

	public Integer midElement(Node head) {
		if (head == null) {
			return null;
		}
		Node n = head;
		int count = 0;
		while (n != null) {
			n = n.next;
			count++;

		}
		int midPoint = (count - 1) / 2;
		n = head;
		int i = 0;
		while (n != null) {
			if (midPoint == i) {
				return n.getValue();
			}
			i++;
			n = n.next;
		}
		return -1;
	}

	public Integer midPoint_using_FastnSlowPointer(Node head) {
		if (head == null) {
			return null;
		}
		Node n = head;
		Node d = head;
		while (d.next != null && d.next.next != null) {
			n = n.next;
			d = d.next.next;
		}
		return n.getValue();
	}

	public static class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}

		public int getValue() {
			return this.value;
		}
	}
}
