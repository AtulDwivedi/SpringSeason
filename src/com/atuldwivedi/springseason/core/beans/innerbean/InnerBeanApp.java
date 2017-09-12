package com.atuldwivedi.springseason.core.beans.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/atuldwivedi/springseason/core/beans/innerbean/inner-bean.xml");
		SuperHero superHeroThruSetter = (SuperHero) context.getBean("superHeroThruSetter");
		SuperHero superHeroThruConstructor = (SuperHero) context.getBean("superHeroThruConstructor");
		System.out.println("Setter "+superHeroThruSetter);
		System.out.println("Constructor "+superHeroThruConstructor);
	}
}
