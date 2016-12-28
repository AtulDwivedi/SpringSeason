package com.atuldwivedi.springseason.loosecoupling.problem.client.withhelper;

import com.atuldwivedi.springseason.loosecoupling.app.helper.OfferHelperWithoutSpring;

public class ThirdPartyClient {
	public static void main(String[] args) {
		OfferHelperWithoutSpring offerHelperWithoutSpring = new OfferHelperWithoutSpring();

		int flatOff = offerHelperWithoutSpring.getFlatOffPercentage();
		System.out.println("Sent flat off percentage to Third Party App : "
				+ flatOff);
	}
}
