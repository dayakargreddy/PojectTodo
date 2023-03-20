package com.project;

public class EmptyToDoListException extends RuntimeException{
	private String message;

	public EmptyToDoListException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
