package com.atuldwivedi.springseason.service;

import java.util.List;

import com.atuldwivedi.springseason.entity.Customer;

public interface CustomerService {
	public Customer addCutomer(Customer customer);

	public Customer getCustomer(String customerId);

	public boolean updateCustomer(Customer customer);

	List<Customer> listCustomers();
}
