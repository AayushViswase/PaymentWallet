package com.PaymentWallet.Models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer walletId;

	@NotNull(message = "Balance cannot be null.")
	@Min(0)
	private double balance;

	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "wallet")
	private List<BankAccount> bankAccounts = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "wallet")
	private List<Transaction> transactions = new ArrayList<>();

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "walletList")
	private List<Beneficiary> beneficiaries = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "wallet")
	private List<BillPayment> billPayments = new ArrayList<>();

}
