package com.PaymentWallet.Models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Beneficiary {
	@Id
	@NotNull(message = "mobile no. should not be null")
	@NotEmpty(message = "mobile no. should not be empty")
	@Size(max = 10)
	private String mobileNo;

	@NotNull(message = "name should not be null")
	@NotEmpty(message = "name cannot be null")
	@Size(min = 3, max = 25, message = "name length should be between 3 to 25")
	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name = "walletId")
	private List<Wallet> walletList = new ArrayList<>();

}
