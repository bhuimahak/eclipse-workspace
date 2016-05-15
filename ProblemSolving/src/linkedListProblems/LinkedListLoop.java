package linkedListProblems;

public class LinkedListLoop {

	public static void main(String[] args) throws Exception {
		LinkedListLoop obj = new LinkedListLoop();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n2;

		Node p = obj.verifyLoop(n1);

		// if (p != null) {
		// System.out.println("Linked list contains loop");
		// int lengthOfLoop = obj.lengthOfTheLoop(p);
		// System.out.println("No of elements in the loop: " + lengthOfLoop);
		// // Node last = lastElementOfTheList
		//
		// } else{
		// System.out.println("Linked list doesnt contain any loop");
		// }

		// System.out.println("Last element of the list is: " +
		// obj.lastElementOfTheList(n1));
		System.out.println("Length of the linked list: " + obj.lengthOfTheLinkedList(n1));
	}

	private int lengthOfTheLoop(Node p) {
		Node n = p.next;
		int count = 1;
		while (n != p) {
			count++;
			n = n.next;
		}
		return count;
	}

	public Node verifyLoop(Node head) throws Exception {
		// boolean isLoop = false;
		Node n = head;
		if (n == null) {
			throw new Exception("Linked list is empty!");
		}
		Node d = null;
		
		d = n.next;
		while (d != null && n != null && d.next != null && n != d) {
			n = n.next;
			d = d.next.next;
		}
		if (n == d) {
			return n;

		} else {
			return null;
		}
	}

	public Node lastElementOfTheList(Node head) {
		// verify whether the linked list contains loop or not
		try {
			Node p = verifyLoop(head);
			if (p != null) {
				int lengthOfLoop = lengthOfTheLoop(p);
				Node i = head;
				Node j = p;
				// find all the elements before p
				Node n = head;
				int k = 0;
				while (n != p) {
					n = n.next;
					k++;
				}
				if (k > lengthOfLoop) {
					int diff = k - lengthOfLoop;
					for (int z = 0; z < diff; z++) {
						i = i.next;
					}
				} else if (k < lengthOfLoop) {
					int difference = lengthOfLoop - k;
					for (int x = 0; x < difference; x++) {
						j = j.next;
					}
				}
				Node parent = null;
				while (i != j) {
					i = i.next;
					parent = j;
					j = j.next;
				}
				return parent;
			} else {
				System.out.println("Linked list doesnt contain any loop");

				Node s = head;
				while (s.next != null) {
					s = s.next;
				}
				return s;
			}

		} catch (Exception e) {
			System.out.println("Linked List is Empty!");
			e.printStackTrace();
		}
		return null;
	}

	public Integer lengthOfTheLinkedList(Node head) throws Exception {
		Node p = verifyLoop(head);
		if (p != null) {
			int loopLength = lengthOfTheLoop(p);
			Node i = head;
			Node j = p;
			// count the number of elements before p
			Node n = head;
			int k = 0;
			while (n != p) {
				n = n.next;
				k++;
			}
			if (k > loopLength) {
				int diff = k - loopLength;
				for (int x = 0; x < diff; x++) {
					i = i.next;
				}
			} else if (k < loopLength) {
				int difference = loopLength - k;
				for (int y = 0; y < difference; y++) {
					j = j.next;
				}
			}
			while (i != j) {
				i = i.next;
				j = j.next;
			}
			// find number of elements before the merge point
			Node start = head;
			int count = 0;
			while (start != i) {
				count++;
				start = start.next;
			}
			return count + loopLength;

		} else {
			System.out.println("Linked list doesnt contain a loop!");
			Node starting = head;
			int number = 0;
			while (starting != null) {
				number++;
				starting = starting.next;
			}
			return number;
		}
	}
	
	public void breakTheLoop(Node head){
		
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
