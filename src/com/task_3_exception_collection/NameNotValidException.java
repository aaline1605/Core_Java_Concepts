package com.task_3_exception_collection;

@SuppressWarnings("serial")
public class NameNotValidException extends Exception {
	
	//Constructor to display a message
	public NameNotValidException(String message) {
		super(message);
		
	}

}
