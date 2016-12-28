package com.atuldwivedi.springseason.loosecoupling.app.helper;

import com.atuldwivedi.springseason.loosecoupling.app.offer.Offer;

public class OfferHelperWithSpring {

	Offer offer;

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public int getFlatOffPercentage() {
		return offer.getFlatOffPercentage();
	}

}
