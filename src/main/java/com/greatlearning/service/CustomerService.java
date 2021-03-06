package com.greatlearning.service;

import java.util.List;

import com.greatlearning.entity.Customer;


public interface CustomerService {
	
	public List<Customer> findAll();

	public Customer findById(int id);

	public void save(Customer cust);

	public void deleteById(int id);
	
	public void updateCustomer(Customer cust);

}
