package com.atuldwivedi.springseason.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atuldwivedi.springseason.dao.CustomerDao;
import com.atuldwivedi.springseason.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public Customer addCutomer(Customer customer) {
		return customerDao.addCutomer(customer);
	}

	@Override
	public Customer getCustomer(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> listCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
