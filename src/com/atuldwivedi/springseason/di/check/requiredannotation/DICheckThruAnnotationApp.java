package com.atuldwivedi.springseason.di.check.requiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Flexible way to mandate any property for dependency check
 * 
 * @author Atul Dwivedi 2017
 */
public class DICheckThruAnnotationApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di-check-required-annotation.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
	}
}
