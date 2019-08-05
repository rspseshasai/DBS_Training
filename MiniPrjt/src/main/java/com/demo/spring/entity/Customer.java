package com.demo.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

	@Column(name = "FNAME")
	private String fName;

	@Column(name = "LNAME")
	private String lName;

	private long phone;

	@Id
	@Column(name = "MAILID", unique = true)
	private String mail;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Customer(String fName, String lName, long phone, String mail) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.phone = phone;
		this.mail = mail;
	}

}
