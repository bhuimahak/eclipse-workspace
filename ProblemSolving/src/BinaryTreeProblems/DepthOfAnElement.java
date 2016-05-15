package BinaryTreeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class DepthOfAnElement {

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
		DepthOfAnElement obj = new DepthOfAnElement();
		System.out.println("Level is " + obj.depthOfElement(n1, 5));
	}

	public Integer depthOfElement(Node root, int value) {
		Queue<Node> queue = new LinkedList<>();
		boolean elementFound = false;
		queue.add(root);
		queue.add(null);
		int level = 1;
		while (!queue.isEmpty()) {
			Node n = queue.remove();
			if (n == null) {
				level++;
				if (queue.isEmpty()) {
					break;
				}
				queue.add(null);
			} else {
				if (value == n.getValue()) {
					elementFound = true;
					break;
				}
				if (n.left != null) {
					queue.add(n.left);
				}
				if (n.right != null) {
					queue.add(n.right);
				}
			}
		}
		if (elementFound) {
			return level;
		} else {
			System.out.println("Element not present in the tree");
			return null;
		}
	}

	public static class Node {
		Node left;
		Node right;
		int value;

		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}

		public int getValue() {
			return this.value;
		}
	}
}
