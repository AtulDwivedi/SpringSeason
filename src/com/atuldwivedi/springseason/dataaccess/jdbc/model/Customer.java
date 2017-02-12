package com.atuldwivedi.springseason.dataaccess.jdbc.model;

public class Customer {
	private long custId;
	private String custName;
	private int age;
	
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName
				+ ", age=" + age + "]";
	}
	public Customer(long custId, String custName, int age) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.age = age;
	}
	
	
}
