package com.atuldwivedi.springseason.dataaccess.jdbc.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.atuldwivedi.springseason.dataaccess.jdbc.dao.CustomerDAO;
import com.atuldwivedi.springseason.dataaccess.jdbc.model.Customer;

public class CustomerDaoDqlImplBeanPropertyRowMapper extends JdbcDaoSupport implements CustomerDAO {

	@Override
	public void insert(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer fetchByCustId(long custId) {
		return (Customer) getJdbcTemplate().queryForObject("SELECT * FROM CUSTOMER WHERE CUST_ID=?", new Object[]{custId}, new BeanPropertyRowMapper<Customer>());
	}

	@Override
	public String fetchCustNameById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> fetchAllCustomers() {
		return (List<Customer>) getJdbcTemplate().queryForObject("SELECT * FROM CUSTOMER WHERE CUST_ID=?", new BeanPropertyRowMapper<Customer>());
	}

}
