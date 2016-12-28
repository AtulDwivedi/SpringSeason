package com.atuldwivedi.springseason.di.via.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourierApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"di-via-setter-method.xml");
		CourierHelper courierHelper = (CourierHelper) context
				.getBean("courierHelper");

		courierHelper.sendCourier();
	}

}
