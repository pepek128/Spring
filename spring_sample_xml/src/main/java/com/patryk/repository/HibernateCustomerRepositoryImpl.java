package com.patryk.repository;

import java.util.ArrayList;
import java.util.List;

import com.patryk.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.patryk.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstname("Patryk");
		customer.setLastname("Chodo³a");

		customers.add(customer);

		return customers;

	}

}
