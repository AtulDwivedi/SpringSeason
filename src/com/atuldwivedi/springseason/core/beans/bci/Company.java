package com.atuldwivedi.springseason.core.beans.bci;

public class Company {
	private String compName;
	private String compHQ;
	private String industry;
	private String type;
	private String location;

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getCompHQ() {
		return compHQ;
	}

	public void setCompHQ(String compHQ) {
		this.compHQ = compHQ;
	}

	@Override
	public String toString() {
		return "Company [compName=" + compName + ", compHQ=" + compHQ
				+ ", industry=" + industry + ", type=" + type + ", location="
				+ location + "]";
	}
}
