package BinaryTree;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// create a binary tree from given set of input and return a head node
public class CreateBinaryTree {

	public Node createTree(Map<Integer, Integer> childParentMapping) throws Exception {
		Set<Entry<Integer, Integer>> entries = childParentMapping.entrySet();
		Map<Integer, Node> nodeMap = new HashMap<>();
		for (Entry<Integer, Integer> entryObject : entries) {
			Integer child = entryObject.getKey();
			Integer parent = entryObject.getValue();
			Node childNode;
			Node parentNode;
			if (!nodeMap.containsKey(child)) {
				childNode = new Node(child);
				nodeMap.put(child, childNode);
			} else {
				childNode = nodeMap.get(child);
			}
			if (!nodeMap.containsKey(parent)) {
				parentNode = new Node(parent);
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

		Node head = null;
		for (Integer parent_value : parentSet) {
			if (!childSet.contains(parent_value)) {
				// head found
				// now get the corresponding node for this parent_value
				head = nodeMap.get(parent_value);
			}
		}
		return head;
	}
}
