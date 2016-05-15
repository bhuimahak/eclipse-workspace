package com.QueueImplementation;

public class QueueUsingArray {
	private String[] arr = new String[4];
	int head = -1;
	int tail = -1;
	int nextPosition;
	int arrayLength = arr.length;

	// enqueue
	public void add(String value) {

		if (head == -1 || tail == -1) {
			// System.out.println("Queue is empty!");
			head = 0;
			tail = 0;
			arr[head] = value;
			return;
		}
		nextPosition = (tail + 1) % arrayLength;

		if (nextPosition != head) {
			arr[nextPosition] = value;
			tail = nextPosition;
		} else {
			System.out.println(value + " Cant be added as Queue is full!!");
		}
	}

	// dequeue
	public String remove() throws Exception {
		if (head == -1 || tail == -1) {
			throw new Exception("Queue is empty!");
		}
		if (head == tail) {
			String value = arr[head];
			System.out.println("only one element in the queue");
			head = -1;
			tail = -1;
			return value;
		}
		String value = arr[head];
		head = (head + 1) % arrayLength;
		return value;
	}

	public void printQueue() {

		if (head == -1 || tail == -1) {
			System.out.println("Queue is empty!");
			return;
		}
		System.out.println("Head is " + arr[head] + "index of head: " + head);
		System.out.println("Tail is " + arr[tail]);
		System.out.println("Index of tail is: " + tail);

		// System.out.println("head " + arr[head]);
		// int nextPos = head + 1 % arrayLength;
		// while (nextPos != head) {
		// System.out.println(arr[nextPos] + "--");
		// nextPos = nextPos + 1 % arrayLength;
		// }
		// System.out.print("Queue: ");
		// int i = head;
		// while (i <= tail) {
		// System.out.print(arr[i] + "--");
		// i++;
		// }
		// System.out.println(" ");
	}

}
