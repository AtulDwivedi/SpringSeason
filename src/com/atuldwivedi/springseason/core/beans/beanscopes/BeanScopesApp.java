package com.atuldwivedi.springseason.core.beans.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"bean-scopes.xml");
		
		CustomerService csA1 = (CustomerService) context
				.getBean("csDefaultSingleton");
		CustomerService csA2 = (CustomerService) context
				.getBean("csDefaultSingleton");
		csA1.setMessage("Default Singleton");
		System.out.println("csA1 "+csA1.getMessage());
		System.out.println("csA2 "+csA2.getMessage());
		
		CustomerService csB1 = (CustomerService) context.getBean("csSingleton");
		CustomerService csB2 = (CustomerService) context.getBean("csSingleton");
		csB1.setMessage("Singleton");
		System.out.println("csB1 "+csB1.getMessage());
		System.out.println("csB2 "+csB2.getMessage());
		
		
		CustomerService csC1 = (CustomerService) context.getBean("csPrototype");
		CustomerService csC2 = (CustomerService) context.getBean("csPrototype");
		csC1.setMessage("Prototype");
		System.out.println("csC1 "+csC1.getMessage());
		System.out.println("csC2 "+csC2.getMessage());
		
	}
}
