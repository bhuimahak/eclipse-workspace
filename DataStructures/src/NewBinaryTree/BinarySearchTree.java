package NewBinaryTree;

public class BinarySearchTree extends BinaryTree {

	public void add(int value) throws Exception {
		TreeNode node = new TreeNode(value);
		if (root == null) {
			root = node;
		} else {
			TreeNode n = root;
			TreeNode parent = null;
			while (n != null) {
				parent = n;
				if (value == n.getValue()) {
					throw new Exception("BST cant hold duplicate values");
				}
				if (value < n.getValue()) {
					n = n.left;
				} else {
					n = n.right;
				}
			}
			if (value < parent.getValue()) {
				parent.left = node;
			} else {
				parent.right = node;
			}
		}
	}

	public boolean find(int value) throws Exception {
		boolean valueIsFound = false;
		if (root == null) {
			throw new Exception("BST is empty!");
		}
		else {
			TreeNode n = root;

			while (n != null) {
				if (value == n.getValue()) {
					valueIsFound = true;
					break;
				}
				if (value < n.getValue()) {
					n = n.left;
				}
				if (value > n.getValue()) {
					n = n.right;
				}
			}
		}
		return valueIsFound;
	}
}
