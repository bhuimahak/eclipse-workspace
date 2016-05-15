package StackandQueueBasedProblems;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
	Queue<Integer> primary = new LinkedList<>();
	Queue<Integer> secondary = new LinkedList<>();

	public static void main(String[] args) throws Exception {
		StackUsingTwoQueues stack = new StackUsingTwoQueues();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("Popped value: " + stack.pop());
	}

	public void push(Integer value) {
		primary.add(value);
	}

	public Integer pop() throws Exception {
		if (primary.isEmpty()) {
			throw new Exception("Stack is empty");
		}
		Integer value = null;
		while (!primary.isEmpty()) {
			value = primary.remove();
			if (!primary.isEmpty()) {
				secondary.add(value);
			}
		}
		Queue<Integer> temp = primary;
		primary = secondary;
		secondary = temp;
		return value;
	}
}
