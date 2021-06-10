package com.residencia.dell.exceptions;

public class OrderlinesException extends Exception{

	private static final long serialVersionUID = 1L;

	public OrderlinesException() {}

	public OrderlinesException(String message) {
			super(message);
	}

	public OrderlinesException(Throwable cause) {
			super(cause);
	}

	public OrderlinesException(String message, Throwable cause) {
			super(message, cause);
	}

	public OrderlinesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
	}
	


}
