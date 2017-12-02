package com.atuldwivedi.springseason.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.atuldwivedi.springseason.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessonFactory;

	@Override
	@Transactional
	public List<Customer> listCustomers() {
		System.out.println("In DAO");
		Session session = sessonFactory.getCurrentSession();
		System.out.println("In DAO Session");
		List<Customer> customers = session.createQuery("from Customer").getResultList();
		System.out.println(customers);
		return customers;
	}

}
