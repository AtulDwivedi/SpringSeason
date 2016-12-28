package com.atuldwivedi.springseason.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-application.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorldBean");
		obj.printMessage();
	}
}
