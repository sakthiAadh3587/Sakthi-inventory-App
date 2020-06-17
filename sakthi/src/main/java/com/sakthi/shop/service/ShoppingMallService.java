package com.sakthi.shop.service;

import java.util.List;

import com.sakthi.shop.entity.CustomerModel;
import com.sakthi.shop.reqresp.Response;
import com.sakthi.shop.reqresp.Request;

public interface ShoppingMallService {

	public List<CustomerModel> getCustomerDetails();

	public Response insertCustomerDetails(Request req);

	public Response updateCustomerDetails(Request req);

	public Response deleteCustomerDetails(int customerid);
}
