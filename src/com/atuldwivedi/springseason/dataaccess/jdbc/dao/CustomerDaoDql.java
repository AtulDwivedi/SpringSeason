package com.atuldwivedi.springseason.dataaccess.jdbc.dao;

import java.util.List;

import com.atuldwivedi.springseason.dataaccess.jdbc.model.Customer;

public interface CustomerDaoDql extends CustomerDAO {
	
	public Customer fetchByCustId(long custId);

	public String fetchCustNameById(long id);

	public List<Customer> fetchAllCustomers();
}
