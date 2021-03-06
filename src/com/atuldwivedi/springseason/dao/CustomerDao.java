package com.atuldwivedi.springseason.dao;

import java.util.List;

import com.atuldwivedi.springseason.entity.Customer;

public interface CustomerDao {
	public Customer addCutomer(Customer customer);

	public Customer getCustomer(String customerId);

	public boolean updateCustomer(Customer customer);

	List<Customer> listCustomers();
}
