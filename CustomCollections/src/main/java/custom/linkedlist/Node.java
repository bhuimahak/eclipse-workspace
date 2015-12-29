package custom.linkedlist;

public class Node {
	String value;
	Node next;

	public Node(String value) {
		this.value = value;
		this.next = null;
	}

	// @Override
	// public String toString() {
	// return "Node [Value=" + s + ", Next=" + next + "]";
	// }

	@Override
	public String toString() {
		return value + " -> " + next;
	}

	public String getValue() {
		return value;
	}

}
