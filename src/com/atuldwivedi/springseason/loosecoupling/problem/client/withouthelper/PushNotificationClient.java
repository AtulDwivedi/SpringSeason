package com.atuldwivedi.springseason.loosecoupling.problem.client.withouthelper;

import com.atuldwivedi.springseason.loosecoupling.app.offer.Offer;
import com.atuldwivedi.springseason.loosecoupling.app.offer.SummerOffer;

public class PushNotificationClient {
	public static void main(String[] args) {
		Offer offer = new SummerOffer();

		int flatOff = offer.getFlatOffPercentage();
		System.out.println("Sent notification with flat off percentage : " + flatOff);
	}
}
