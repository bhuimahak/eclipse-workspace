package BinaryTreeProblems;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTreeProblems.LevelOrderTraversal.Node;

//Given that the input is a binary tree   connect all the elements in the same level or depth using links.

public class LinkingSameLevelNodes {

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
		LinkingSameLevelNodes obj = new LinkingSameLevelNodes();
		System.out.println("Tree: ");
		obj.linkingSameLevelNodes(n1);
		System.out.println("Node links: ");
		obj.printLinkingNodes(n1);

	}

	private void linkingSameLevelNodes(Node root) {
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
				n.next = queue.peek();

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
		Node next;
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

	public void printLinkingNodes(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node n = queue.remove();
			if (n.next != null)
				System.out.println("node" + n.getValue() + "-->" + n.next.getValue());

			if (n.left != null) {
				queue.add(n.left);
			}
			if (n.right != null) {
				queue.add(n.right);
			}
		}
	}
}
