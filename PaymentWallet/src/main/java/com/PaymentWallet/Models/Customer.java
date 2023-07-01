package com.PaymentWallet.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
	@Size(max = 10)
	private String mobileNo;

	@NotNull(message = "Name should not be null")
	@NotEmpty(message = "Name should not be empty")
	@Size(min = 3, max = 25, message = "name length should be between 3 to 25")
	private String customerName;

	@NotNull(message = "password no. should not be null")
	@NotEmpty(message = "password no. should not be empty")
	private String password;

	@OneToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Wallet wallet;

}
