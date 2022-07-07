package com.greatlearning.dao;

import java.util.List;

import com.greatlearning.entity.Customer;


public interface CustomerDAO {

	
	public void updateCustomer(Customer cust);
	public List<Customer> findAll();
	
	public Customer findById(int id);
	
	public void save(Customer cust);
	
	public void deleteById(int id);

	
}
