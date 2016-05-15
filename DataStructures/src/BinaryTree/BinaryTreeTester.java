package BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeTester {

	public static void main(String[] args) {

		CreateBinaryTree obj = new CreateBinaryTree();

		// create a child parent mapping in a hashmap which would be supplied as
		// an input to the createTree method in createBinary tree class
		Map<Integer, Integer> childParentMap = new HashMap<>();
		childParentMap.put(3, 2);
		childParentMap.put(4, 2);
		childParentMap.put(5, 3);
		childParentMap.put(6, 3);
		childParentMap.put(7, 4);
		childParentMap.put(8, 4);
		childParentMap.put(9, 5);
		try {
			Node head = obj.createTree(childParentMap);
			System.out.println("Head node for this tree is: " + head.getValue());
			System.out.println("LEVEL ORDER TRAVERSAL");
			LevelOrderTraversal levelOrder = new LevelOrderTraversal();
			levelOrder.levelOrderTraversal(head);
			System.out.println("PRE ORDER TRAVERSAL");
			BinaryTreeTraversals traversal = new BinaryTreeTraversals();
			traversal.printPreOrderTraversal(head);
			System.out.println("");
			System.out.println("POST ORDER TRAVERSAL");
			traversal.printPostOrderTraversal(head);
			System.out.println("");
			System.out.println("IN ORDER TRAVERSAL");
			traversal.PrintInOrderTraversal(head);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
