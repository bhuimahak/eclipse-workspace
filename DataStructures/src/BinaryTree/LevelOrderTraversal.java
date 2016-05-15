package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {

	public void levelOrderTraversal(Node head) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(head);
		queue.add(null);

		while (!queue.isEmpty()) {
			Node n = queue.remove();
			if (n == null) {
				System.out.println("");
				if (!queue.isEmpty()) {
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

	public void reverseLevelOrderTraversal(Node head) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(head);
		queue.add(null);

		Stack<List<Integer>> levelsStack = new Stack<>();
		List<Integer> level = new ArrayList<>();

		while (!queue.isEmpty()) {
			Node n = queue.remove();
			if (n == null) {
				levelsStack.push(level);
				level = new ArrayList<>();
				if (!queue.isEmpty()) {
					queue.add(null);
				}
			} else {
				level.add((Integer) n.getValue());
				if (n.left != null) {
					queue.add(n.left);
				}
				if (n.right != null) {
					queue.add(n.right);
				}
			}
		}

		while (!levelsStack.isEmpty()) {
			List<Integer> l = levelsStack.pop();
			System.out.println(l);
		}
	}

}
