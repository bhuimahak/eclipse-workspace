package revision;

public class LinkedListHasLoop {

	public static void main(String[] args) throws Exception {
		LinkedListHasLoop obj = new LinkedListHasLoop();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n3; // in n1 its failing why?

		Node p = obj.verifyLoop(n1);
		if (p != null) {
			System.out.println("Linked list has loop");
			int totalElementsInTheLoop = noOfElementsInloop(p);
			System.out.println("Total Elements in the loop: " + totalElementsInTheLoop);
			Node last =LinkedListLastElement(n1, p);
			System.out.println("The last node of the loopy linked list is: "+last.getValue());

		} else {
			System.out.println("Linked list doesnt have loop!");
		}
	}

	private static Node LinkedListLastElement(Node head, Node p) {
		Node n = head;
		// count the no of elements before p
		int k = 0;
		while (n != p) {
			k++;
			n = n.next;
		}
		// find no of elements after p
		Node s = p.next;
		int l = 0;
		while (s != p) {
			l++;
			s = s.next;
		}
		// calculate the diff
		int diff = 0;
		if (k > l) {
			System.out.println("k is greater than l here");
			Node d = p.next;
			diff = k - l;
			System.out.println("diff is: "+diff);
			Node n1 = head;
			while (diff > 0) {
				n1 = n1.next;
				diff--;
			}
			while (n1.next != d.next) {
				n1 = n1.next;
				d = d.next;
			}
			return d;

		} else if (k <= l) {
			System.out.println("k is equal to or less than l here");
			diff = l - k;
			System.out.println("diff is: "+diff);
			Node start = head;
			Node n2 = p.next;
			while (diff > 0) {
				n2 = n2.next;
				diff--;
			}
			while (start.next != n2.next) {
				start = start.next;
				n2 = n2.next;
			}
			return n2;
		}
		return null;
	}

	private static int noOfElementsInloop(Node p) {
		Node n = p.next;
		int count = 0;
		while (n != p) {
			count++;
			n = n.next;
		}
		return count + 1;
	}

	private Node verifyLoop(Node head) throws Exception {
		if (head == null) {
			throw new Exception("Linked list is empty!");
		}
		Node n = head;
		Node d = n.next;
		while (d != null && d.next != null && n != d) {
			n = n.next;
			d = d.next.next;
		}
		if (n == d) {
			return n;
		}
		return null;
	}

	public static class Node {
		Node next;
		int value;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}

		public int getValue() {
			return this.value;
		}
	}

}
