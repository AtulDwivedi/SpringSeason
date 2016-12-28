package com.atuldwivedi.springseason.core.beans.innerbean;

public class SuperHero {

	private Person person;

	public SuperHero(Person person) {
		super();
		this.person = person;
	}
	
	

	public SuperHero() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Person getPerson() {
		return person;
	}



	public void setPerson(Person person) {
		this.person = person;
	}



	@Override
	public String toString() {
		return "SuperHero [person=" + person + "]";
	}
}
