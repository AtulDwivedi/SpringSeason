package com.atuldwivedi.springseason.core.beans.beanscopes;

public class CustomerService {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "CustomerService [message=" + message + "]";
	}
	
	
}
