package com.atuldwivedi.springseason.dataaccess.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atuldwivedi.springseason.dataaccess.jdbc.dao.CustomerDAO;
import com.atuldwivedi.springseason.dataaccess.jdbc.dao.CustomerDaoDql;
import com.atuldwivedi.springseason.dataaccess.jdbc.model.Customer;

public class JDBCApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"da/jdbc/hw/hw-module.xml");
		CustomerDaoDql customerDaoDql = (CustomerDaoDql) context.getBean("beanPropertyRowMapper");
//		customerDAO.insert(new Customer(1003, "Amar", 24));
		System.out.println(customerDaoDql.fetchByCustId(1003));
//		System.out.println(customerDaoDql.fetchCustNameById(1003));
		System.out.println(customerDaoDql.fetchAllCustomers());
	}
}
