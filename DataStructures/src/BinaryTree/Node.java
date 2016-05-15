package BinaryTree;

public class Node<E> {
	E value;
	Node left;
	Node right;

	public Node(E value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public E getValue() {
		return this.value;
	}

}
