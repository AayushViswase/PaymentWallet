package com.PaymentWallet.Service;

import java.util.List;

import com.PaymentWallet.Exceptions.InsufficientFundException;
import com.PaymentWallet.Exceptions.InvalidCredentialsException;
import com.PaymentWallet.Models.BillPayment;

public interface BillPaymentService {
	public BillPayment addBillPayment(BillPayment billPayment, String sessionKey)
			throws InvalidCredentialsException, InsufficientFundException;

	public List<BillPayment> viewAllBillPayments(String sessionKey)
			throws InvalidCredentialsException, InsufficientFundException;
}
