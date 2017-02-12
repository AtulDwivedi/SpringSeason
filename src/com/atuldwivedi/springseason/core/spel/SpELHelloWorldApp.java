package com.atuldwivedi.springseason.core.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpELHelloWorldApp {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spel-helloworld.xml");
	Order order = (Order) context.getBean("order");
	System.out.println(order);
//	context = 
}
}
