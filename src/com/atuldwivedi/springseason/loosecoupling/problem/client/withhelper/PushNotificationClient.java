package com.atuldwivedi.springseason.loosecoupling.problem.client.withhelper;

import com.atuldwivedi.springseason.loosecoupling.app.helper.OfferHelperWithoutSpring;

public class PushNotificationClient {
	public static void main(String[] args) {
		OfferHelperWithoutSpring offerHelperWithoutSpring = new OfferHelperWithoutSpring();

		int flatOff = offerHelperWithoutSpring.getFlatOffPercentage();
		System.out.println("Sent notification with flat off percentage : " + flatOff);
	}
}
