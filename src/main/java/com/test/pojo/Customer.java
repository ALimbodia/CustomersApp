package com.test.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	private Address address;
	private int customerId;
	private String email;
	private String name;
	private String phone;

	@OneToOne
	@JoinColumn(name = "cust_address_id")
	public Address getAddress() {
		return address;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	public int getCustomerId() {
		return customerId;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + getName() + " - Phone: " + getPhone() + "]";
	}
}
