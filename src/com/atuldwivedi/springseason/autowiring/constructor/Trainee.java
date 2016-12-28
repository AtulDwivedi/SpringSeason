package com.atuldwivedi.springseason.autowiring.constructor;

public class Trainee {
	private Course course;

	public Trainee(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Trainee [course=" + course + "]";
	}
}
