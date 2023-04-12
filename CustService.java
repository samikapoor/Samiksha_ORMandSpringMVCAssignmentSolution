package com.hari.crm.service;

import java.util.List;

import com.hari.crm.entity.Customer;




public interface CustService {

	public List<Customer> findAll();
	
	public Customer findById(int theId);

	public void save(Customer theCustomer);
	
	public void deleteById(int theId);

}