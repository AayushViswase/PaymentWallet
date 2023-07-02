package com.PaymentWallet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentWallet.Models.CurrentUserSession;

public interface CurrentUserSessionRepo extends JpaRepository<CurrentUserSession, String> {
	public CurrentUserSession findBySessionkey(String sessionkey);

}
