package custom.linkedlist;

public class CustomLinkedListTester {

	public static void main(String[] args) {

		CustomLinkedList list = new CustomLinkedList();
		list.add("Arslan");
		list.add("Vikram");
		list.add("Das");
		list.add("Pandey");
		list.print();
		
		/*try {
			list.delete("Das");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("");
		list.print();
		
		try {
			list.delete("Das");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("");
		list.print(); */
		
		try {
			list.add(4, "newTailNode");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("");
		list.print();
	} 

}
