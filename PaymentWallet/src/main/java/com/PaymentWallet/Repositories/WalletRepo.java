package com.PaymentWallet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentWallet.Models.Wallet;

public interface WalletRepo extends JpaRepository<Wallet, Integer> {

}
