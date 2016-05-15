package StackandQueueBasedProblems;

import java.util.Stack;

public class QueueUsingTwoStacks {
	Stack<Integer> stack_add = new Stack<>();
	Stack<Integer> stack_remove = new Stack<>();

	public static void main(String[] args) throws Exception {
		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);

		System.out.println("Removed element is: " + queue.remove());
		System.out.println("Removed element is: " + queue.remove());
		System.out.println("Removed element is: " + queue.remove());
		System.out.println("Removed element is: " + queue.remove());
	}

	public void add(Integer value) {
		stack_add.push(value);
	}

	public Integer remove() throws Exception {
		if (stack_add.isEmpty() && stack_remove.isEmpty()) {
			throw new Exception("Queue is empty!");
		}
		Integer value = null;
		if (stack_remove.isEmpty()) {
			while (!stack_add.isEmpty()) {
				// value = stack_add.pop();
				stack_remove.push(stack_add.pop());
			}
		}
		return stack_remove.pop();
	}
}
