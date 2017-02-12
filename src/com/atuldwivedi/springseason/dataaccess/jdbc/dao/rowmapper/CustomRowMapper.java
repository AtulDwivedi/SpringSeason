package com.atuldwivedi.springseason.dataaccess.jdbc.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.atuldwivedi.springseason.dataaccess.jdbc.model.Customer;

public class CustomRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
		Customer customer = new Customer();
		customer.setCustId(paramResultSet.getLong(1));
		customer.setCustName(paramResultSet.getString(2));
		customer.setAge(paramResultSet.getInt(3));
		return customer;
	}
}
