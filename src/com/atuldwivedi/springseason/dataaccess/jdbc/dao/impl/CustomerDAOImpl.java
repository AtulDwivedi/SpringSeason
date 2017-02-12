package com.atuldwivedi.springseason.dataaccess.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.atuldwivedi.springseason.dataaccess.jdbc.dao.CustomerDAO;
import com.atuldwivedi.springseason.dataaccess.jdbc.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	private DataSource dataSource;

	private Connection con;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insert(Customer customer) {
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con
					.prepareStatement("INSERT INTO CUSTOMER VALUES(?, ?, ?)");
			ps.setLong(1, customer.getCustId());
			ps.setString(2, customer.getCustName());
			ps.setInt(3, customer.getAge());
			int i = ps.executeUpdate();
			System.out.println(i);
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Customer fetchByCustId(long custId) {
		Customer customer = null;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con
					.prepareStatement("SELECT * FROM CUSTOMER WHERE CUST_ID = ?");
			ps.setLong(1, custId);
			ResultSet rs = ps.executeQuery();
			rs.next();
			customer = new Customer(rs.getLong(1), rs.getString(2),
					rs.getInt(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customer;
	}

	@Override
	public String fetchCustNameById(long id) {
		String customerName = null;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con
					.prepareStatement("SELECT CUST_NAME FROM CUSTOMER WHERE CUST_ID = ?");
			ResultSet rs = ps.executeQuery();
			rs.next();
			customerName = rs.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customerName;
	}

	@Override
	public List<Customer> fetchAllCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con
					.prepareStatement("SELECT CUST_NAME FROM CUSTOMER WHERE CUST_ID = ?");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setCustId(rs.getLong(1));
				customer.setCustName(rs.getString(2));
				customer.setAge(rs.getInt(3));

				customers.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;
	}

}
