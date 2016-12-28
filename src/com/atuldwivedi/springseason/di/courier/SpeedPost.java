package com.atuldwivedi.springseason.di.courier;

public class SpeedPost implements CourierService {

	public void sendCourier() {
		System.out.println("Your courier is shipeed via SpeedPost.");
	}
}
