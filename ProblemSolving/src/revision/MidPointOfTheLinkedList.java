package revision;

import linkedListProblems.MidPointOfLinkedList.Node;

public class MidPointOfTheLinkedList {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		//Node n5 = new Node(5);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		//n4.next = n5;

		MidPointOfTheLinkedList obj = new MidPointOfTheLinkedList();
		System.out.println("Value of middle node is: " + obj.findMid(n1));
	}

	public Integer findMid(Node head) {
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
