package com.PaymentWallet.Service;

import javax.security.auth.login.LoginException;

import com.PaymentWallet.Models.Login;

public interface LoginServie {
	public String LoginToAccount(Login login) throws LoginException;

	public String LogoutFromAccount(String sessionKey) throws LoginException;

}
