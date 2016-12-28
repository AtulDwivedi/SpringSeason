package com.atuldwivedi.springseason.autowiring.byname;

public class Laptop {
	private OperatingSystem os;

	public void setOs(OperatingSystem os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "Laptop [os=" + os + "]";
	}
	
	
}
