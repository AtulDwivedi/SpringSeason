package com.atuldwivedi.springseason.di.check;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Deprecated since Spring 3.x
 * @author Atul Dwivedi 2017
 */
public class DICheckApp {
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		String[] diCheckArr = { "none", "simple", "objects", "all" };
		int randomNum = (int) Math.floor(Math.random() * 4);
		String diCheck = diCheckArr[randomNum];
		
		System.out.println("Random Number: " + randomNum+" and DI Checking level: "+diCheck);
		
		switch (diCheck) {
		case "simple":
			context = new ClassPathXmlApplicationContext(
					"di-check-simple.xml");
		case "objects":
			context = new ClassPathXmlApplicationContext(
					"di-check-objects.xml");
		case "all":
			context = new ClassPathXmlApplicationContext(
					"di-check-all.xml");
		default:
			context = new ClassPathXmlApplicationContext(
					"di-check-none-default.xml");
		}

		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
	}
}
