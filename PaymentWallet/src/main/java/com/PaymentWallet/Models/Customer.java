package com.PaymentWallet.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	@Id
	@NotNull(message = "mobile no. should not be null")
	@NotEmpty(message = "mobile no. should not be empty")
	private String mobileNo;

	@NotNull(message = "Name should not be null")
	@NotEmpty(message = "Name should not be empty")
	private String customerName;

	@NotNull(message = "password no. should not be null")
	@NotEmpty(message = "password no. should not be empty")
	private String password;

}
