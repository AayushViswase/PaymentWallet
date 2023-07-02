package com.PaymentWallet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentWallet.Models.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {

}
