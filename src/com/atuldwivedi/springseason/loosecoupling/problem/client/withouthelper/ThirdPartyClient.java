package com.atuldwivedi.springseason.loosecoupling.problem.client.withouthelper;

import com.atuldwivedi.springseason.loosecoupling.app.offer.Offer;
import com.atuldwivedi.springseason.loosecoupling.app.offer.SummerOffer;

public class ThirdPartyClient {
	public static void main(String[] args) {
		Offer offer = new SummerOffer();

		int flatOff = offer.getFlatOffPercentage();
		System.out.println("Sent flat off percentage to Third Party App : "
				+ flatOff);
	}
}
