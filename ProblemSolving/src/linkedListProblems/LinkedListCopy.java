package linkedListProblems;

public class LinkedListCopy {

	public static void main(String[] args) throws Exception {

		Node n1 = new Node(1);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		Node n = copyLinkedList(n1); // returns the head of new Linked list
										// formed
		printLinkedList(n);
	}

	public static Node copyLinkedList(Node head) throws Exception {
		if (head == null) {
			throw new Exception();
		}
		Node n = head;
		Node parent = null;
		Node headnew = null;

		while (n != null) {
			Node copy = new Node(n.getValue());
			if (headnew == null) {
				headnew = copy;
			} else {
				parent.next = copy;
			}
			parent = copy;
			n = n.next;
		}
		return headnew;
	}

	private static void printLinkedList(Node head) throws Exception {
		if (head == null) {
			throw new Exception("Empty list!");
		}
		Node n = head;
		while (n != null) {
			System.out.print(n.getValue() + "--");
			n = n.next;
		}
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
