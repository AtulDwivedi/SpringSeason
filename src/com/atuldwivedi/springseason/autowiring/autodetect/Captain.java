package com.atuldwivedi.springseason.autowiring.autodetect;

public class Captain {
	private String catainName;

	public void setCatainName(String catainName) {
		this.catainName = catainName;
	}

	@Override
	public String toString() {
		return "Captain [catainName=" + catainName + "]";
	}
}
