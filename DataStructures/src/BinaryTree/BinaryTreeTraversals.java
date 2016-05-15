package BinaryTree;

public class BinaryTreeTraversals {

	// it accepts a head node in the start

	public void printPreOrderTraversal(Node n) {
		// NLR
		if (n == null) {
			return;
		}
		System.out.print(n.getValue() + "--");
		printPreOrderTraversal(n.left);
		printPreOrderTraversal(n.right);
	}

	public void printPostOrderTraversal(Node n) {
		// LRN
		if (n == null) {
			return;
		}
		printPostOrderTraversal(n.left);
		printPostOrderTraversal(n.right);
		System.out.print(n.getValue() + "--");
	}

	public void PrintInOrderTraversal(Node n) {
		// LNR
		if (n == null) {
			return;
		}
		PrintInOrderTraversal(n.left);
		System.out.print(n.getValue() + "--");
		PrintInOrderTraversal(n.right);
	}
}
