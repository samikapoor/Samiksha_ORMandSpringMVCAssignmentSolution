package com.samiksha.crm.service;

import java.util.List;

import com.samiksha.crm.entity.Customer;




public interface CustService {

	public List<Customer> findAll();
	
	public Customer findById(int theId);

	public void save(Customer theCustomer);
	
	public void deleteById(int theId);

}