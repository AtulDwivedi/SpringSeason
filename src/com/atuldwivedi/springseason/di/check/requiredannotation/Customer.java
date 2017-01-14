package com.atuldwivedi.springseason.di.check.requiredannotation;

import org.springframework.beans.factory.annotation.Required;

public class Customer {
	private Person person;
	private String type;
	private String action;

	public Person getPerson() {
		return person;
	}

	@Required
	public void setPerson(Person person) {
		this.person = person;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + ", type=" + type + ", action="
				+ action + "]";
	}
}
