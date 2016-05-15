package revision;

import java.util.HashMap;
import java.util.Map;

import linkedListProblems.LinkedListCopyWithRandomPointer.Node;

public class LinkedListWithRandomPointer {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n1.random = n3;
		n2.random = n5;
		n3.random = n2;
		n4.random = n1;
		n5.random = n4;
		LinkedListWithRandomPointer obj = new LinkedListWithRandomPointer();
		System.out.println(n1);
		Node newHead = obj.createCopy(n1);
		System.out.println("HEad of a newly formed linked list " + newHead);
		printLinkedlist(newHead);
	}

	private static void printLinkedlist(Node newHead) {
		Node n = newHead;
		while (n != null) {
			System.out.print(n.getValue() + "-" + n.random.getValue() + "--");
			n = n.next;
		}
	}

	public Node createCopy(Node head) {
		Node n = head;
		Map<Integer, Node> nodeMap = new HashMap<>();
		while (n != null) {
			Node newNode = new Node(n.getValue());
			nodeMap.put(n.getValue(), newNode);
			n = n.next;
		}
		n = head;
		while (n != null) {
			Node current = nodeMap.get(n.getValue());
			if (n.next != null) {
				Node nextNode = nodeMap.get(n.next.getValue());
				current.next = nextNode;
			}
			if (n.random != null) {
				Node randomNode = nodeMap.get(n.random.getValue());
				current.random = randomNode;
			}
			n = n.next;
		}
		// returning the head of the newly formed LinkedList
		return nodeMap.get(head.getValue());
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

}
