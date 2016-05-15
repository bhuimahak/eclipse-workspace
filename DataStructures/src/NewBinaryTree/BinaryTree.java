package NewBinaryTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Map.Entry;

public class BinaryTree {
	TreeNode root;
	
	
	public BinaryTree(){
		//default constructors
	}

	public BinaryTree(Map<Integer, Integer> childParentMapping) throws Exception {
		Set<Entry<Integer, Integer>> entries = childParentMapping.entrySet();
		Map<Integer, TreeNode> nodeMap = new HashMap<>();
		for (Entry<Integer, Integer> entryObject : entries) {
			Integer child = entryObject.getKey();
			Integer parent = entryObject.getValue();
			TreeNode childNode;
			TreeNode parentNode;
			if (!nodeMap.containsKey(child)) {
				childNode = new TreeNode(child);
				nodeMap.put(child, childNode);
			} else {
				childNode = nodeMap.get(child);
			}
			if (!nodeMap.containsKey(parent)) {
				parentNode = new TreeNode(parent);
				nodeMap.put(parent, parentNode);
			} else {
				parentNode = nodeMap.get(parent);
			}
			if (parentNode.left == null) {
				parentNode.left = childNode;
			} else if (parentNode.right == null) {
				parentNode.right = childNode;
			} else {
				throw new Exception("Both the child nodes are filled, give correct input map");
			}
		}

		// now we have to find the head node of this tree, logic is that in
		// input mapping which is supplied here, the node which is present
		// in
		// parent and not in
		// child is the one which we are looking for
		Set<Integer> childSet = childParentMapping.keySet();
		Collection<Integer> parentCollection = childParentMapping.values();
		Set<Integer> parentSet = new HashSet<>(parentCollection);

		for (Integer parent_value : parentSet) {
			if (!childSet.contains(parent_value)) {
				// head found
				// now get the corresponding node for this parent_value
				this.root = nodeMap.get(parent_value);
			}
		}
	}

	public void printPreOrderTraversal() {
		printPreOrderTraversal(root);
	}

	private void printPreOrderTraversal(TreeNode n) {
		// NLR
		if (n == null) {
			return;
		}
		System.out.print(n.getValue() + "--");
		printPreOrderTraversal(n.left);
		printPreOrderTraversal(n.right);
	}

	public void printPostOrderTraversal() {
		printPostOrderTraversal(root);
	}

	private void printPostOrderTraversal(TreeNode n) {
		// LRN
		if (n == null) {
			return;
		}
		printPostOrderTraversal(n.left);
		printPostOrderTraversal(n.right);
		System.out.print(n.getValue() + "--");
	}

	public void printInOrderTraversal() {
		printInOrderTraversal(root);
	}

	private void printInOrderTraversal(TreeNode n) {
		// LNR
		if (n == null) {
			return;
		}
		printInOrderTraversal(n.left);
		System.out.print(n.getValue() + "--");
		printInOrderTraversal(n.right);
	}

	public void levelOrderTraversal() {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(null);

		while (!queue.isEmpty()) {
			TreeNode n = queue.remove();
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

	public void reverseLevelOrderTraversal() {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(null);

		Stack<List<Integer>> levelsStack = new Stack<>();
		List<Integer> level = new ArrayList<>();

		while (!queue.isEmpty()) {
			TreeNode n = queue.remove();
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

class TreeNode {
	Integer value;
	TreeNode left;
	TreeNode right;

	public TreeNode(Integer value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public Integer getValue() {
		return this.value;
	}
}
