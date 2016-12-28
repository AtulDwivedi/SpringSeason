package com.atuldwivedi.springseason.di.via.setter;

import com.atuldwivedi.springseason.di.courier.CourierService;

public class CourierHelper {
	CourierService courierService;

	public void setCourierService(CourierService courierService) {
		this.courierService = courierService;
	}
	
	public void sendCourier(){
		courierService.sendCourier();
	}
}
