package com.atuldwivedi.springseason.dataaccess.jdbc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.atuldwivedi.springseason.dataaccess.jdbc.dao.CustomerDAO;
import com.atuldwivedi.springseason.dataaccess.jdbc.model.Customer;

public class CustomerDAOImplJdbcDaoSupport extends JdbcDaoSupport implements CustomerDAO {

	@Override
	public void insert(Customer customer) {
		String insertSQL = "INSERT INTO CUSTOMER VALUES(?, ?, ?)";
		getJdbcTemplate().update(insertSQL, new Object[]{
			customer.getCustId(), customer.getCustName(), customer.getAge()	
		});
	}

	@Override
	public Customer fetchByCustId(long custId) {
		return getJdbcTemplate().query("SELECT * FROM CUSTOMER WHERE CUST_ID = '"+custId+"'", new RowMapper<Customer>(){
			@Override  
		    public Customer mapRow(ResultSet rs, int rownumber) throws SQLException {  
				Customer cust=new Customer(rs.getLong(1), rs.getString(2), rs.getInt(3));    
		        return cust;  
		    }  
		}).get(0);
	}

	@Override
	public String fetchCustNameById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> fetchAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
