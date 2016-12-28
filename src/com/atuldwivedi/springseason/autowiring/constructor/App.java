package com.atuldwivedi.springseason.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"auto-wiring-by-constructor.xml");
		Trainee trainee = (Trainee) context.getBean("trainee");

		System.out.println(trainee);
	}

}
