package com.atuldwivedi.springseason.dataaccess.jdbc.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.atuldwivedi.springseason.dataaccess.jdbc.dao.CustomerDAO;
import com.atuldwivedi.springseason.dataaccess.jdbc.dao.rowmapper.CustomRowMapper;
import com.atuldwivedi.springseason.dataaccess.jdbc.model.Customer;

public class CustomerDaoDqlImplCustomRowMapper extends JdbcDaoSupport implements CustomerDAO {

	@Override
	public void insert(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer fetchByCustId(long custId) {
		return (Customer) getJdbcTemplate().queryForObject("SELECT * FROM CUSTOMER WHERE CUST_ID=?", new Object[]{custId}, new CustomRowMapper());
	}

	@Override
	public String fetchCustNameById(long id) {
		return (String) getJdbcTemplate().queryForObject("SELECT CUST_NAME FROM CUSTOMER WHERE CUST_ID=?", new Object[]{id}, String.class);
	}

	@Override
	public List<Customer> fetchAllCustomers() {
		String sql = "SELECT * FROM CUSTOMER";
		List<Customer> custList = new ArrayList<Customer>();
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map<String, Object> map : rows) {
			Customer customer = new Customer();
			customer.setCustId((long)map.get("CUST_ID"));
			customer.setCustName((String)map.get("CUST_NAME"));
			customer.setAge((int)map.get("AGE"));
			custList.add(customer);
		}
		return custList;
	}

}
