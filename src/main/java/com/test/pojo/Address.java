package com.test.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	private String city;
	private int addressId;
	private String state;
	private String street;
	private String zip;

	@Column(name = "city")
	public String getCity() {
		return city;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_id")
	public int getAddressId() {
		return addressId;
	}

	@Column(name = "state")
	public String getState() {
		return state;
	}

	@Column(name = "street")
	public String getStreet() {
		return street;
	}

	@Column(name = "zip")
	public String getZip() {
		return zip;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
