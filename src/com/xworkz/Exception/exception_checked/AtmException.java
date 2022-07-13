package com.xworkz.Exception.exception_checked;

public class AtmException extends Exception {

	// public AtmException(String message) {
	// super(message);
	
	@Override
	public String toString() {
		return "you crossed your daily limit:";
		
	}
	@Override
	public String getMessage() {
		return "invalid amount entered";
	}

}