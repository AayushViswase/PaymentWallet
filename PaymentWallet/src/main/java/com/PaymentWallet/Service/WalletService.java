package com.PaymentWallet.Service;

import com.PaymentWallet.Exceptions.CustomerException;
import com.PaymentWallet.Exceptions.InsufficientFundException;
import com.PaymentWallet.Exceptions.InvalidCredentialsException;
import com.PaymentWallet.Exceptions.WalletException;
import com.PaymentWallet.Models.BankAccount;
import com.PaymentWallet.Models.Customer;
import com.PaymentWallet.Models.Wallet;

public interface WalletService {
	public Wallet showBalance(String sessionKey) throws InvalidCredentialsException, CustomerException;

	public String fundTransfer(String targetMobileNo, double amount, String sessionKey)
			throws InvalidCredentialsException;

	public Customer updateAccount(Customer customer, String sessionKey)
			throws InvalidCredentialsException, CustomerException, InsufficientFundException;

	public Wallet addMoney(String sessionKey, double amount, BankAccount account)
			throws InvalidCredentialsException, WalletException;
}
