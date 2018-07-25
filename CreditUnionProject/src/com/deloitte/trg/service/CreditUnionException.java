package com.deloitte.trg.service;

public class CreditUnionException extends RuntimeException {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String message;
public CreditUnionException() {
}
public CreditUnionException(String message) {
	super(message);
	this.message=message;
}
public String getMessage() {
	return this.message;
}
}
