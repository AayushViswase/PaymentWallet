package com.PaymentWallet.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class CurrentUserSession {
	@Id
	@NotNull(message = "mobile no. should not be null")
	@NotEmpty(message = "mobile no. should not be empty")
	@Size(max = 10)
	@Column(unique = true)
	private String mobileNo;

	private String Sessionkey;

}
