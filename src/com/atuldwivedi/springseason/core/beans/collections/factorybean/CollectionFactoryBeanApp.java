package com.atuldwivedi.springseason.core.beans.collections.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionFactoryBeanApp {
	public static void main(String[] args) {
		ApplicationContext contex = null;
		int randNum = (int) (Math.random() * 10);
		if (randNum < 6) {
			contex = new ClassPathXmlApplicationContext(
					"collection-factory-bean.xml");
			System.out.println("collection-factory-bean.xml");
		} else {
			contex = new ClassPathXmlApplicationContext(
					"collection-factory-bean-util-schema.xml");
			System.out.println("collection-factory-bean-util-schema.xml");
		}
		Customer customer = (Customer) contex.getBean("cfb");
		System.out.println(customer);
	}
}
