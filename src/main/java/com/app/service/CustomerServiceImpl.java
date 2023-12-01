package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Customer;
import com.app.exception.CustomerNotFoundException;
import com.app.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepository repo;

	@Override
	public Long saveCustomer(Customer cust) {
		return repo.save(cust).getId();
	}

	@Override
	public Customer getCustomerById(Long id) {
		Optional<Customer> opt = repo.findById(id);
		return validateInput(opt, id.toString());

	}

	@Override
	public Customer getCustomerByEmail(String email) {
		Optional<Customer> opt = repo.findByEmail(email);
		return validateInput(opt, email);

	}

	@Override
	public Customer getCustomerByPanCard(String pancard) {
		Optional<Customer> opt = repo.findByPanCardId(pancard);
		return validateInput(opt, pancard);

	}

	@Override
	public Customer getCustomerByMobile(String mobile) {
		Optional<Customer> opt = repo.findByMobile(mobile);
		return validateInput(opt, mobile);

	}

	@Override
	public Customer getCustomerByAadhar(String aadhar) {
		Optional<Customer> opt = repo.findByAadharId(aadhar);
		return validateInput(opt, aadhar);

	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	private Customer validateInput(Optional<Customer> opt, String input) {
		/*
		 * if (opt.isEmpty()) { throw new CustomerNotFoundException("Customer '" + input
		 * + "' not found"); } else { return opt.get(); }
		 */
		// JDK 8
		return opt.orElseThrow(() -> new CustomerNotFoundException("Customer '" + input + "' not found"));
	}

}
