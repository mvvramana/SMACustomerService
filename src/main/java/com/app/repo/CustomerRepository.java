package com.app.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Optional<Customer> findByEmail(String email);

	Optional<Customer> findByAadharId(String aadharId);

	Optional<Customer> findByPanCardId(String panCardId);

	Optional<Customer> findByMobile(String mobile);

}
