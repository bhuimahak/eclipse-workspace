package revision;

import linkedListProblems.LinkedListCopy.Node;

public class LinkedListReversal {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		//System.out.println("Head of the reversed Linked list is: " + iterativeApproach(n1).getValue());
		System.out.println("Head of the reversed Linked list is: "+recursiveApproach(n1).getValue());
	}

	public static Node recursiveApproach(Node n) {
		if (n.next == null) {
			return n;
		}
		Node newHead = recursiveApproach(n.next);
		n.next.next = n;
		n.next = null;
		return newHead;
	}

	public static Node iterativeApproach(Node head) {
		Node current = head;
		Node parent = null;
		while (current != null) {
			Node nextNode = current.next;
			current.next = parent;
			parent = current;
			current = nextNode;
		}
		return parent;
	}

	public static class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return this.value;
		}
	}

}
