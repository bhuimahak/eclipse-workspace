package BinaryTreeProblems;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTreeProblems.LevelOrderTraversal.Node;

public class PrintLevelWise {

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
		PrintLevelWise obj = new PrintLevelWise();
		obj.printLevelWise(n1);

	}

	public void printLevelWise(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		while (!queue.isEmpty()) {
			Node n = queue.remove();
			if (n == null) {
				System.out.println("");
				if (queue.isEmpty()) {
					break;
				} else {
					queue.add(null);
				}
			} else {
				System.out.print(n.getValue() + "--");
				if (n.left != null) {
					queue.add(n.left);
				}
				if (n.right != null) {
					queue.add(n.right);
				}
			}
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
