package linkedListProblems;

public class LinkedListReversal {

	public static void main(String[] args) {
		LinkedListReversal obj = new LinkedListReversal();
		Node head = obj.createLinkedList(1, 2, 3, 4);
		obj.printLinkedList(head);
		obj.printReverse(head);

		// System.out.println("head value is: " + obj.getHead());
		// obj.linkedListReversalIterative(head);
		// obj.printLinkedList();
		// System.out.println("head value is: " + obj.getHead());
		obj.linkedListRecursive(head);
		// obj.printLinkedList(head);
	}

	public Node createLinkedList(int... values) {
		Node head = null;
		for (int value : values) {
			Node newNode = new Node(value);
			if (head == null) {
				head = newNode;
			} else {
				Node n = head;
				while (n.next != null) {
					n = n.next;
				}
				n.next = newNode;
			}
		}
		return head;
	}

	public Node linkedListReversalIterative(Node head) {
		Node parent = null;
		Node current = head;
		while (current != null) {
			Node nextNode = current.next;
			current.next = parent;
			parent = current;
			current = nextNode;
		}
		return parent;
	}

	public Node linkedListRecursive(Node n) {
		if (n.next == null) {
			return n;
		}
		Node newHead = linkedListRecursive(n.next);
		n.next.next = n;
		n.next = null;
		return newHead;
	}

	public void printLinkedList(Node head) {
		Node n = head;
		while (n != null) {
			System.out.print(n.getValue() + "--");
			n = n.next;
		}
		System.out.println(" ");
	}

	public void printReverse(Node n) {
		if (n == null) {
			return;
		}
		printReverse(n.next);
		System.out.print(n.getValue() + "--");
	}

	public class Node {
		Node next;
		int value;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}

		public int getValue() {
			return this.value;
		}
	}
}