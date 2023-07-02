package com.PaymentWallet.Service;

import java.time.LocalDate;
import java.util.List;

import com.PaymentWallet.E.TransactionException;
import com.PaymentWallet.Exceptions.InvalidCredentialsException;
import com.PaymentWallet.Exceptions.WalletException;
import com.PaymentWallet.Models.Transaction;

public interface TransactionService {
	public Transaction addTransaction(Transaction transaction);

	public Transaction viewTransaction(String sessionKey, Integer transactionId)
			throws WalletException, InvalidCredentialsException;

	public List<Transaction> viewAllTransactions(String sessionKey) throws WalletException, InvalidCredentialsException;

	public List<Transaction> viewTransactionsByDate(LocalDate from, LocalDate to, String sessionKey)
			throws TransactionException, InvalidCredentialsException;
}
