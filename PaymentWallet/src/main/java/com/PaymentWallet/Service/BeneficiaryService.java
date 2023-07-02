package com.PaymentWallet.Service;

import java.util.List;

import com.PaymentWallet.Exceptions.BeneficiaryNotFoundException;
import com.PaymentWallet.Exceptions.CustomerException;
import com.PaymentWallet.Exceptions.InvalidCredentialsException;
import com.PaymentWallet.Exceptions.WalletException;
import com.PaymentWallet.Models.Beneficiary;

public interface BeneficiaryService {
	public Beneficiary addBeneficiary(Beneficiary beneficiary, String sessionKey)
			throws CustomerException, WalletException, InvalidCredentialsException;

	public Beneficiary deleteBeneficiary(Beneficiary beneficiary, String sessionKey)
			throws BeneficiaryNotFoundException, WalletException, InvalidCredentialsException;

	public Beneficiary viewBeneficiary(String mobileNo, String sessionKey)
			throws BeneficiaryNotFoundException, InvalidCredentialsException;

	public List<Beneficiary> viewAllBeneficiaries(String sessionKey)
			throws BeneficiaryNotFoundException, InvalidCredentialsException;
}
