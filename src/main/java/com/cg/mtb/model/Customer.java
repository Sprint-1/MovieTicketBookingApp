package com.cg.mtb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@Id
	private int customerId;
	private String customerName;
	
	@Column(name="address")
	private String customerAddress;
	
	
	@Column(name="mobilenumber")
	private String customerMobileNumber;
	
	@Column(name="email")
	private String customerEmail;
	
	@Column(name="password")
	private String customerPassword;
	
}
