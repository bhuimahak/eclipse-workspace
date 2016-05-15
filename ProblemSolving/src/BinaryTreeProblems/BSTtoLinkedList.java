package BinaryTreeProblems;

import BinaryTreeProblems.DepthOfAnElement.Node;

public class BSTtoLinkedList {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		BSTtoLinkedList obj = new BSTtoLinkedList();
		Node head = obj.bstToLL(n1);
		//printLL(head);

	}

	public Node bstToLL(Node n) {
		Node head = n;
		if (n == null) {
			return null;
		}
		if (n.left == null && n.right == null) {
			return n;
		}
		Node left = bstToLL(n.left);
		if (left != null) {
			head = left;
			Node k = head;
			while (k != null) {
				k = k.right;
			}
			k.right = n;
			n.left = k;
		}
		Node right = bstToLL(n.right);
		if (right != null) {
			n.right = right;
			right.left = n;
		}
		return head;
	}

	public static class Node {
		int value;
		Node right;
		Node left;

		public Node(int value) {
			this.value = value;
			// this.next = null;
		}

		public int getValue() {
			return this.value;
		}
	}

}
