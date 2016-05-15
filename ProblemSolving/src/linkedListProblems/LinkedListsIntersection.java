package linkedListProblems;

import java.util.Stack;

public class LinkedListsIntersection {

	public static void main(String[] args) {
		LinkedListsIntersection obj = new LinkedListsIntersection();
		Node head1 = obj.createLinkedList(1, 2, 3, 4, 5, 6);
		Node head2 = obj.createLinkedList(6, 7, 8);
		head2.next.next.next = head1.next.next;
		obj.printLinkedList(head1);
		obj.printLinkedList(head2);
		int mergePoint = obj.linkedListsIntersectionPoint(head1, head2);
	}

	public int linkedListsIntersectionPoint(Node head1, Node head2) {
		Stack<Node> stackOne = new Stack<>();
		Stack<Node> stackTwo = new Stack<>();

		Node n1 = head1;
		Node n2 = head2;

		while (n1 != null) {
			stackOne.push(n1);
			n1 = n1.next;
		}
		while (n2 != null) {
			stackTwo.push(n2);
			n2 = n2.next;
		}

		while (stackOne.peek() == stackTwo.peek()) {
			stackOne.pop();
			stackTwo.pop();
		}
		Node n = stackOne.pop();
		// its merging at the next node
		System.out.println("Its merging at: " + n.next.getValue());
		return n.next.getValue();
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

	public void printLinkedList(Node head) {
		Node n = head;
		while (n != null) {
			System.out.print(n.getValue() + "--");
			n = n.next;
		}
		System.out.println(" ");
	}

}
