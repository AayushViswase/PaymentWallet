package com.PaymentWallet.Models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class BillPayment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer billId;

	@NotNull(message = "Bill Type cannot be Null.")
	@NotEmpty(message = "Bill Type cannot be Empty.")
	private String billType;

	@NotNull(message = "Amount cannot be null")
	@Min(1)
	private double amount;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@NotNull
	private Date paymentDate;
}
