package com.atuldwivedi.springseason.autowiring.byname;

public class OperatingSystem {
	private String osName;

	public void setOsName(String osName) {
		this.osName = osName;
	}

	@Override
	public String toString() {
		return "OperatingSystem [osName=" + osName + "]";
	}
	
	
	
}
