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
public class Admin {

	@Id
	private int adminId;
	private String adminName;
	
	@Column(name="contact")
	private String adminContact;
	
	@Column(name="password")
	private String adminPassword;
}
