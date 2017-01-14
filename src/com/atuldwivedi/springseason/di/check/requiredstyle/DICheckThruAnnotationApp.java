package com.atuldwivedi.springseason.di.check.requiredstyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Most flexible way to mandate any property for dependency check
 * 
 * @author Atul Dwivedi 2017
 */
public class DICheckThruAnnotationApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di-check-requiredstyle-annotation.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
	}
}
