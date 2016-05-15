package com.linkedListImplementation;

public class LinkedListEmptyException extends Exception {
	private static final long serialVersionUID = -990255059878782652L;

	// String message;

	public LinkedListEmptyException(String message) {
		super(message);
	}

	public LinkedListEmptyException(Throwable t) {
		super(t);
	}

	public LinkedListEmptyException(String message, Throwable t) {
		super(message, t);
	}
	
	public static LinkedListEmptyException getException(String message) {
		return new LinkedListEmptyException(message);
	}

}
