package com.atuldwivedi.springseason.core.beans.prepostactions;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageServiceUsingInterface extends MessageService implements InitializingBean, DisposableBean {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void destroy() throws Exception {
		System.out.println("Spring Container has been destroyed! MessageService clean up");
	}

	public void afterPropertiesSet() throws Exception {
		System.out
				.println("Init method after properties are set : " + message);
	}

	public void printMessage() {
		System.out.println(this.getClass().getSimpleName()+": "+getMessage());
	}
}
