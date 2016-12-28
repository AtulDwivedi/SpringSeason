package com.atuldwivedi.springseason.loosecoupling.solution.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atuldwivedi.springseason.loosecoupling.app.helper.OfferHelperWithSpring;

public class ThirdPartyClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "loose-coupling.xml" });

		OfferHelperWithSpring offerHelperWithSpring = (OfferHelperWithSpring) context
				.getBean("springHelper");

		int flatOff = offerHelperWithSpring.getFlatOffPercentage();
		System.out.println("Sent flat off percentage to Third Party App : "
				+ flatOff);
	}
}
