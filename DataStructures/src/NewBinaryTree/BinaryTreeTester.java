package NewBinaryTree;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeTester {

	public static void main(String[] args) throws Exception {

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

//		BinaryTree obj = new BinaryTree(childParentMap);
//
//		System.out.println("LEVEL ORDER TRAVERSAL");
//		obj.levelOrderTraversal();
//		System.out.println("PRE ORDER TRAVERSAL");
//		obj.printPreOrderTraversal();
//		System.out.println("");
//		System.out.println("POST ORDER TRAVERSAL");
//		obj.printPostOrderTraversal();
//		System.out.println("");
//		System.out.println("IN ORDER TRAVERSAL");
//		obj.printInOrderTraversal();
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(8);
		bst.add(3);
		bst.add(9);
		bst.printPreOrderTraversal();
		boolean value = bst.find(3);
		System.out.println("Value is " +value);
	}
}
