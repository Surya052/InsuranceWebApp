package com.health.insurance.service.exception;

public class BlankException extends RuntimeException{

	public BlankException() {}
	
	public BlankException(String message) {
		super(message);
	}

}
