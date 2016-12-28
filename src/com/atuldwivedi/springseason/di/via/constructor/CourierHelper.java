package com.atuldwivedi.springseason.di.via.constructor;

import com.atuldwivedi.springseason.di.courier.CourierService;

public class CourierHelper {
	CourierService courierService;

	public CourierHelper(CourierService courierService) {
		this.courierService = courierService;
	}

	public void sendCourier(){
		courierService.sendCourier();
	}
}
