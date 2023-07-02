package com.PaymentWallet.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentWallet.Models.BankAccount;

public interface BankAccountRepo extends JpaRepository<BankAccount, Integer> {

}
