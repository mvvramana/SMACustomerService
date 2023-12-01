package com.app.service;

import java.util.List;

import com.app.entity.Customer;

public interface ICustomerService {
	
	Long saveCustomer(Customer cust);
	Customer getCustomerById(Long id);
	Customer getCustomerByEmail(String email);
	Customer getCustomerByPanCard(String pancard);
	Customer getCustomerByMobile(String mobile);
	Customer getCustomerByAadhar(String aadhar);
	
	List<Customer> getAllCustomers();
	
}
