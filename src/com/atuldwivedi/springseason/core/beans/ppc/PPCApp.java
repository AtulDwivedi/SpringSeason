package com.atuldwivedi.springseason.core.beans.ppc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PPCApp {
	public static void main(String[] args) {
		ApplicationContext context = null;
		int randomNum = (int) (Math.random() * 10);
		if (randomNum < 6) {
			context = new ClassPathXmlApplicationContext("ppc-non-config.xml");
			System.out.println("Random Number is: "+randomNum+" DB properties from: ppc-non-config.xml");
		} else {
			context = new ClassPathXmlApplicationContext("ppc-config.xml");
			System.out.println("DB properties from: ppc-config.xml");
		}
		DataSource ds = (DataSource) context.getBean("ds");
		ds.printJdbcDetails();
	}
}
