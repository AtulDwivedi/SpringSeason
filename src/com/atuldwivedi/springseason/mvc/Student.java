package com.atuldwivedi.springseason.mvc;

import java.util.Arrays;

public class Student {

	private String fullName;
	private String email;
	private String country;
	private String gender;
	private String[] courses;
	private boolean graduate;
	private String comment;

	public Student() {
		super();
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isGraduate() {
		return graduate;
	}

	public void setGraduate(boolean graduate) {
		this.graduate = graduate;
	}
}
