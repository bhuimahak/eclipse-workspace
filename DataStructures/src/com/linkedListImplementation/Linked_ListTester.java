package com.linkedListImplementation;

public class Linked_ListTester {

	public static void main(String[] args) {
		Linked_List list = new Linked_List();
		list.addAtTheBeginning("Mehak");
//		list.addAtTheBeginning("Arslan");
//		list.addAtTheBeginning("Vikram");
		

		list.printLinkedListRecursive();
		System.out.println(" ");
		try {
			list.removeFirstElement();
		} catch (LinkedListEmptyException e) {
			
			e.printStackTrace();
		}
		list.printLinkedListRecursive();
		//list.printReverseLinkedList();
	}

}
