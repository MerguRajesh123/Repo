package com.dnapass.java.training.Exceptions;

import java.util.List;


class InsufficientFundsException extends Exception{
	private List<String> details;
	private final ErrorCode code;
	
	public InsufficientFundsException(ErrorCode code) {
		this.code=code;
	}
	public InsufficientFundsException(String message, Throwable cause, ErrorCode code) {
		super(message, cause);
		this.code = code;
	}
	
	public InsufficientFundsException(List<String> details, String message, Throwable cause, ErrorCode code) {
		super(message,cause);
		this.code= code;
		this.details= details;
	}
	public InsufficientFundsException(String message ,ErrorCode code) {
		super(message);
		this.code=code;
	}
	
	public List<String> getDetails(){
		return details;
	}
	public ErrorCode getCode() {
		return code;
	}
	
}