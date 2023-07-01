package com.PaymentWallet.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class BankAccount {
	@Id
	private Integer bankAccountNo;

	@NotNull(message = "Balance cannot be null")
	@Min(0)
	private double balance;

	@NotNull(message = "Bank Name cannot be Null.")
	@NotEmpty(message = "Bank Name cannot be Empty.")
	private  String bankName;

	@NotNull(message = "IFSC Code cannot be Null.")
	@NotEmpty(message = "IFSC Code cannot be Empty.")
	private String ifsc_code;

}
