package revision;

import linkedListProblems.LinkedListCopy.Node;

public class LinkedListCopy {

	public static void main(String[] args) throws Exception {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;

		Node head = createACopy(n1);
		Node n = head;
		while (n != null) {
			System.out.print(n.getValue() + "--");
			n = n.next;
		}
	}

	private static Node createACopy(Node head) throws Exception {
		if (head == null) {
			throw new Exception("Linked list is empty");
		}
		Node current = head;
		Node newHead = null;
		Node parent = null;
		while (current != null) {
			Node n = new Node(current.getValue());
			if (newHead == null) {
				newHead = n;
			} else {
				parent.next = n;
			}
			parent = n;
			current = current.next;
		}
		return newHead;
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
