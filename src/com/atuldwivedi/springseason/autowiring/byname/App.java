package com.atuldwivedi.springseason.autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"auto-wiring-by-name.xml");
		Laptop laptop = (Laptop) context.getBean("laptop");

		System.out.println(laptop);
	}

}
