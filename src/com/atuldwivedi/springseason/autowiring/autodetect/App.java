package com.atuldwivedi.springseason.autowiring.autodetect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Deprecated
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"auto-wiring-by-autodetect.xml");
		Team team = (Team) context.getBean("team");

		System.out.println(team);
	}
}
