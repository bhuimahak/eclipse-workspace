package com.stackImplementation;

public class StackPrint {

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push("4");
		st.push("3");
		st.push("2");
		st.push("1");
		
		try {
			printStack(st);
		} catch (StackEmptyException e) {
			e.printStackTrace();
		}
	}

	private static void printStack(Stack st) throws StackEmptyException {
		if(st.isEmpty()) {
			return;
		}
		String val = st.pop();
		System.out.println(val);
		printStack(st);
		st.push(val);
	}
	
	private static void reverseStack(Stack st) throws StackEmptyException {
		if(st.isEmpty()) {
			return;
		}
		String val = st.pop();
		reverseStack(st);
		addAtBottom(st, val);
	}

	private static void addAtBottom(Stack st, String val) {
		// TODO Auto-generated method stub
		
	}
}
