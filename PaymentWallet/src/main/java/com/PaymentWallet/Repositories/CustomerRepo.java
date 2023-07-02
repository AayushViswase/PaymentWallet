package com.PaymentWallet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentWallet.Models.Customer;

public interface CustomerRepo extends JpaRepository<Customer, String> {
	public Customer findByMobileNo(String mobileNo);

}
