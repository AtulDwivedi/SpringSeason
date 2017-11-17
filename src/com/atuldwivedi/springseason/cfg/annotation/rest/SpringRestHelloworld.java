package com.atuldwivedi.springseason.cfg.annotation.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atuldwivedi.springseason.mvc.Car;
import com.sun.media.jfxmedia.Media;

@RestController
@RequestMapping("/hello")
public class SpringRestHelloworld {

	@RequestMapping(value = { "/sayIt" }, produces={MediaType.APPLICATION_JSON_VALUE}, method = {
			RequestMethod.GET }/* , headers="Accept=application/json" */)
	public Car sayHello() {
		System.out.println("I'm here!");
		Car car = new Car();
		car.setCarName("HondaCity");
		car.setCarColor("Black");
		car.setCountryOfOrigin("IND");
		car.setEnd("High");
		return car;
	}
}
