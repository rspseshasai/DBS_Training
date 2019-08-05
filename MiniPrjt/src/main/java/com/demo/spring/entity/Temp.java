package com.demo.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEMP")
public class Temp {
	
	@Id
	@Column(name="MAILID")
	private String email;
	
	@Column(name="PROBLEM")
	private String problemDesc;
	
	
	public String getProblemDesc() {
		return problemDesc;
	}

	public void setProblemDesc(String problemDesc) {
		this.problemDesc = problemDesc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Temp(String email, String problemDesc) {
		super();
		this.email = email;
		this.problemDesc = problemDesc;
	}

	public Temp() {
		
	}
}
