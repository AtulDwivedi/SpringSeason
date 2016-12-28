package com.atuldwivedi.springseason.loosecoupling.app.helper;

import com.atuldwivedi.springseason.loosecoupling.app.offer.Offer;
import com.atuldwivedi.springseason.loosecoupling.app.offer.SummerOffer;


public class OfferHelperWithoutSpring {

	Offer offer;

	public OfferHelperWithoutSpring() {
		offer = new SummerOffer();
	}

	public int getFlatOffPercentage() {
		return offer.getFlatOffPercentage();
	}

}
