package com.atuldwivedi.springseason.di.courier;

public class FedEx implements CourierService {

	public void sendCourier() {
		System.out.println("Your courier is shipeed via FedEx.");
	}

}
