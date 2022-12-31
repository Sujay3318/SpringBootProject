package com.example.Project;


public class BadRequest extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadRequest(String message) {
		super(message);
	}

	public BadRequest(String message, Throwable throwable) {
		super(message, throwable);
	}

}