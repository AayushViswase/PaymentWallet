package com.PaymentWallet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentWallet.Models.BillPayment;

public interface BillPaymentRepo extends JpaRepository<BillPayment, Integer> {

}
