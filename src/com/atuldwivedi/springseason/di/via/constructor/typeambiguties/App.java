package com.atuldwivedi.springseason.di.via.constructor.typeambiguties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"di-constructor-type-ambiguties.xml");
		Courier courier = (Courier) context.getBean("courierSolution2");
		courier.displayData();
	}
}
