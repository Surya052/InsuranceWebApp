package com.health.insurance.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HealthInsuranceEntity {
	private String username;
	@Id
	private Long mobile;
	private String password;
	private LocalDate dob;
	private String email;
	
	public HealthInsuranceEntity() {
	}
	

	public HealthInsuranceEntity(String username, Long mobile, String password, LocalDate dob, String email) {
		super();
		this.username = username;
		this.mobile = mobile;
		this.password = password;
		this.dob = dob;
		this.email = email;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "HealthInsuranceEntity [username=" + username + ", mobile=" + mobile + ", password=" + password
				+ ", dob=" + dob + ", email=" + email + "]";
	}

	
		
}
