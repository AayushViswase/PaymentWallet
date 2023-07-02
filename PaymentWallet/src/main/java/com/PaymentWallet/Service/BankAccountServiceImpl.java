package com.PaymentWallet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PaymentWallet.Models.BankAccount;
import com.PaymentWallet.Models.Wallet;
import com.PaymentWallet.Repositories.BankAccountRepo;
import com.PaymentWallet.Repositories.CurrentUserSessionRepo;
import com.PaymentWallet.Repositories.CustomerRepo;
import com.PaymentWallet.Repositories.WalletRepo;

@Service
public class BankAccountServiceImpl implements BankAccountService {
	@Autowired
	private BankAccountRepo accountRepo;

	@Autowired
	private WalletRepo walletRepo;

	@Autowired
	private CurrentUserSessionRepo sessionRepo;

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public Wallet addAccount(BankAccount bankAccount, String sessionKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Wallet removeAccount(Integer accountNo, String sessionKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BankAccount> viewAccounts(String sessionKey) {
		// TODO Auto-generated method stub
		return null;
	}

}
