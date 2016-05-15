package custom.linkedlist;

public class CustomLinkedList {
	Node head;

	public void add(String value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			return;
		}
		// traversing thru the linked list until last node is found
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = newNode;
	}

	public void printList() {
		Node n = head;
		if (n == null) {
			System.out.println("List is empty");
			return;
		}
		while (n != null) {
			System.out.println(n);
			n = n.next;
		}
	}

	// one more way to Print list using toString
	public void print() {
		if (head == null) {
			System.out.println("List is empty.");
		} else {
			System.out.println(head);
		}
	}

	public void delete(String value) throws Exception {
		if (head == null) {
			throw new Exception("List is empty.");
		}
		if (head.getValue() == value) {
			head = head.next;
			return;
		}
		Node n = head;
		while ((n.next != null) && (n.next.getValue() != value)) {
			n = n.next;
		}
		if (n.next != null) {
			n.next = n.next.next;
		} else {
			throw new Exception("Given value not found in the list.");
		}
	}

	public int length() {
		Node n = head;
		int count = 0;
		while (n != null) {
			n = n.next;
			count++;
		}
		return count;
	}
	
	
	@Override
	public String toString() {
		return "CustomLinkedList [head=" + head + "]";
	}

	public void add(int position, String value) throws Exception {
		int count = length();
		if (position < 0 || position > count){
			throw new Exception("Please enter a valid position");
		}
		Node n = new Node(value);
		if (position == 0){
			n.next = head;
			head = n;
		}
		else{
			Node nod = head;
			int x = 0;
			while(x < (position-1)){
				nod = nod.next;
				x++;
			}
			Node temp = nod.next;
			nod.next = n;
			n.next = temp;
		}
	}
}
