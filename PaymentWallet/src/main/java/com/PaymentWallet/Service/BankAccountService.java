package com.PaymentWallet.Service;

import java.util.List;

import com.PaymentWallet.Models.BankAccount;
import com.PaymentWallet.Models.Wallet;

public interface BankAccountService {
	public Wallet addAccount(BankAccount bankAccount, String sessionKey);

	public Wallet removeAccount(Integer accountNo, String sessionKey);

	public List<BankAccount> viewAccounts(String sessionKey);
}
