package com.stackImplementation;

public class StackEmptyException extends Exception {
	private static final long serialVersionUID = -3960570976692370553L;

	public StackEmptyException(String message) {
		super(message);
	}

	public StackEmptyException(String message, Throwable cause) {
		super(message, cause);
	}

	public StackEmptyException(Throwable cause) {
		super(cause);
	}

}
