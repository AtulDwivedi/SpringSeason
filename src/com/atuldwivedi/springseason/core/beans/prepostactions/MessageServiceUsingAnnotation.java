package com.atuldwivedi.springseason.core.beans.prepostactions;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class MessageServiceUsingAnnotation extends MessageService {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@PostConstruct
	public void initIt() throws Exception {
		System.out.println("Init method after properties are set : " + message);
	}

	@PreDestroy
	public void cleanUp() throws Exception {
		System.out.println("Spring Container has been destroyed! MessageService clean up");
	}
	
	public void printMessage() {
		System.out.println(this.getClass().getSimpleName()+": "+getMessage());
	}
}
