package com.atuldwivedi.springseason.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.atuldwivedi.springseason.mvc.valid.BatchCode;

public class Customer {

	@NotNull(message="is required")
	@Size(min=2, message="minimum lenght is 2")
	private String firstName;

	@NotNull
	private String lastName;
	
	/*@NotNull(message="is required")
	@Min(value=18, message="customer age should be greate than or equal to 18 years")
	@Max(value=100, message="customer age should be less than or equal to 100 years")
	private int age;*/
	
	@NotNull(message="is required")
	@Min(value=18, message="customer age should be greate than or equal to 18 years")
	@Max(value=100, message="customer age should be less than or equal to 100 years")
	private Integer age;
	
	@Pattern(regexp="^[a-zA-Z0-9]{6}", message="only 6 chars/digits")
	private String customerCode;
	
	@BatchCode(value="JM2", message="prefix should be JM1")
	private String batchCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

}
