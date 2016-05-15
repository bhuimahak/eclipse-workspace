package linkedListProblems;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCopyWithRandomPointer {
	public static void main(String[] args) {

		Node n1 = new Node(1);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		Node n5 = new Node(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n1.random = n3;
		n2.random = n5;
		n3.random = n2;
		n4.random = n1;
		n5.random = n4;
		LinkedListCopyWithRandomPointer obj = new LinkedListCopyWithRandomPointer();
		obj.printLinkedList(n1);

	}

	public void printLinkedList(Node head) {
		Node n = head;
		while (n != null) {
			System.out.print("Value: " + n.getValue());
			System.out.print(", Next: " + (n.next == null ? "NULL" : n.next.getValue()));
			System.out.print(", Random: " + (n.random == null ? "NULL" : n.random.getValue()));

			n = n.next;
			System.out.println();
		}
	}

	public static class Node {
		int value;
		Node next;
		Node random;

		public Node(int value) {
			this.value = value;
		}
		public int getValue() {
			return this.value;
		}
	}

	public Node copyLinkedList(Node head) {
		Node n = head;
		Map<Integer, Node> nodeMap = new HashMap<>();
		while (n != null) {
			int nodeValue = n.getValue();
			Node copy = new Node(nodeValue);
			nodeMap.put(nodeValue, copy);
			n = n.next;
		}
		n = head;
		while (n != null) {
			int nodeValue = n.getValue();
			Node currentNode = nodeMap.get(nodeValue);
			if (n.next != null) {
				Node nextNode = nodeMap.get(n.next.getValue());
				currentNode.next = nextNode;
			}
			if (n.random != null) {
				Node randomNode = nodeMap.get(n.random.getValue());
				currentNode.random = randomNode;
			}
			n = n.next;
		}
		Node newHead = nodeMap.get(head.getValue());
		return newHead;
	}
}
