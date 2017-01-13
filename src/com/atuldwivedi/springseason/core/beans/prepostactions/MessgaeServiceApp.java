package com.atuldwivedi.springseason.core.beans.prepostactions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessgaeServiceApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = null;
		int randNum = (int) (Math.random() * 10);
		MessageService msgService = null;
		if (randNum < 4) {
			context = new ClassPathXmlApplicationContext(
					"bean-pre-post-action.xml");
			msgService = (MessageServiceUsingInterface) context
					.getBean("msgService");
		} else if (randNum <= 4 && randNum < 8) {
			context = new ClassPathXmlApplicationContext(
					"bean-pre-post-action-thru-xml.xml");
			msgService = (MessageServiceUsingXML) context.getBean("msgService");
		} else {
			context = new ClassPathXmlApplicationContext(
					"bean-pre-post-action-thru-annotation.xml");
			msgService = (MessageServiceUsingAnnotation) context
					.getBean("msgService");
		}

		msgService.printMessage();

		context.close();
	}
}
