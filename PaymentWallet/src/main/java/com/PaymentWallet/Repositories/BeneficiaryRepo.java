package com.PaymentWallet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentWallet.Models.Beneficiary;

public interface BeneficiaryRepo extends JpaRepository<Beneficiary, String> {

}
