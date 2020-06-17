package com.sakthi.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="sakthi_customer")
//@Data

public class CustomerModel {
	@Id
	@Column(name="custmer_id")
	private Integer custmer_id;
	
	@NotNull
	private Integer store_id;
	
	@NotNull
	private String first_name;
	
	private String last_name;
	
	private String email;
	
	private String address_id;
	
	public int getCustomer_id() {
		return custmer_id;
	}

	public void setCustmer_id(int customer_id) {
		this.custmer_id = customer_id;
	}

	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress_id() {
		return address_id;
	}

	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	

}
