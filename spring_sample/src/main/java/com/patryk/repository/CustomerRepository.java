package com.patryk.repository;

import java.util.List;

import com.patryk.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}