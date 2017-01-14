package com.atuldwivedi.springseason.core.beans.bci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BCIApp {
	public static void main(String[] args) {
		ApplicationContext context = null;
		Company comp = null;

		int randomNum = (int) (Math.random() * 10);
		System.out.println("Random Number: "+randomNum);
		context = new ClassPathXmlApplicationContext(
				"bci-bean-configuration-inheritance.xml");
		if (randomNum < 5) {
			comp = (Company) context.getBean("newComp");
		} else if(randomNum < 8) {
			comp = (Company) context.getBean("companyHQ");
		}
		else{
			comp = (Company) context.getBean("newCompOverrideParentProp");
		}

		System.out.println(comp);
	}
}
