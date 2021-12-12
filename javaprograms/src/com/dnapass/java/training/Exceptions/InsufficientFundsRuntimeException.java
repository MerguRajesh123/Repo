package com.dnapass.java.training.Exceptions;

import java.util.List;

class InsufficientFundsRuntimeException extends RuntimeException{
	private List<String> details;
	private final ErrorCode code;
	
	public InsufficientFundsRuntimeException(ErrorCode code) {
		this.code=code;
	}
	public InsufficientFundsRuntimeException(String message, Throwable cause, ErrorCode code) {
		super(message, cause);
		this.code = code;
	}
	
	public InsufficientFundsRuntimeException(List<String> details, String message, Throwable cause, ErrorCode code) {
		super(message,cause);
		this.code= code;
		this.details= details;
	}
	public InsufficientFundsRuntimeException(String message ,ErrorCode code) {
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

