package com.stackImplementation;

public class StackFullException extends Exception {
	private static final long serialVersionUID = -9073491509391028603L;

	public StackFullException(String message){
	super(message);
	}
	public StackFullException(String message, Throwable cause) {
		super(message, cause);
	}

	public StackFullException(Throwable cause) {
		super(cause);
	}

}
