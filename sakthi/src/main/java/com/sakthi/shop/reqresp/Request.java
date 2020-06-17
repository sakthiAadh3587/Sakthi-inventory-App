package com.sakthi.shop.reqresp;

public class Request {

	private Integer custmer_id;
	
	public Integer getCustmer_id() {
		return custmer_id;
	}

	public void setCustmer_id(Integer custmer_id) {
		this.custmer_id = custmer_id;
	}

	public Integer getStore_id() {
		return store_id;
	}

	public void setStore_id(Integer store_id) {
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

	private Integer store_id;
	
	private String first_name;
	
	private String last_name;
	
	private String email;
	
	private String address_id;
	
}
