package static_count_objects;

public class Duck {

	private int size;
	public static int noOfObjetcs = 0;

	public Duck() {
		this.size = 3;
		noOfObjetcs++;
	}

	public Duck(int size) {
		if (size < 3) {
			this.size = 3;
			noOfObjetcs++;
		} else {
			this.size = size;
			noOfObjetcs++;
		}

	}

	public static void main(String[] args) {
		Duck one = new Duck();
		Duck two = new Duck(2);
		System.out.println(noOfObjetcs);
	}
}
