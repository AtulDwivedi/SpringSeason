package com.atuldwivedi.springseason.core.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("inject-collection-values.xml");
		Customer cust = (Customer) context.getBean("customerBean");
		
		System.out.println(cust);
	}

}
