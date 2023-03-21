package com.jpl.backend.bo;

import java.io.Serializable;

public class BaseBusinessObject implements Serializable{
	
	private static final long serialVersionUID = -5237294951471292095L;
	private String message;
	private Enum statusCode;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Enum getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Enum statusCode) {
		this.statusCode = statusCode;
	}

	
	
}
