package com.sakthi.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakthi.shop.entity.CustomerModel;
import com.sakthi.shop.repository.ShoppingMallRepo;
import com.sakthi.shop.reqresp.Response;
import com.sakthi.shop.reqresp.Request;
import com.sakthi.shop.service.ShoppingMallService;

@Service
public class ShoppingMallServiceImpl implements ShoppingMallService {
	@Autowired
	private ShoppingMallRepo shoppingMallRepo;

	@Override
	public List<CustomerModel> getCustomerDetails() {

		List<CustomerModel> customerDetails = shoppingMallRepo.findAll();

		// shoppingMallRepo.deleteById();

		System.out.println("Sucess");
		return customerDetails;

	}

	@Override
	public Response insertCustomerDetails(Request req) {
		// TODO Auto-generated method stub
		Response res = new Response();
		CustomerModel customerModel = new CustomerModel();
		customerModel.setCustmer_id(req.getCustmer_id());
		customerModel.setStore_id(req.getStore_id());
		customerModel.setAddress_id(req.getAddress_id());
		customerModel.setEmail(req.getEmail());
		customerModel.setFirst_name(req.getFirst_name());
		customerModel.setLast_name(req.getLast_name());

		// customerModel.set
		shoppingMallRepo.save(customerModel);
		res.setResult("INSERT SUCCESS");
		return res;
	}

	@Override
	public Response updateCustomerDetails(Request req) {
		// TODO Auto-generated method stub
		Response res = new Response();
		CustomerModel customerModel = new CustomerModel();
		customerModel.setCustmer_id(req.getCustmer_id());
		customerModel.setStore_id(req.getStore_id());
		customerModel.setAddress_id(req.getAddress_id());
		customerModel.setEmail(req.getEmail());
		customerModel.setFirst_name(req.getFirst_name());
		customerModel.setLast_name(req.getLast_name());
		shoppingMallRepo.save(customerModel);
		res.setResult("UPDATE SUCCESS");
		return res;
	}

	@Override
	public Response deleteCustomerDetails(int customerid) {
		Response res = new Response();
		shoppingMallRepo.deleteById(customerid);
		res.setResult("DELETE SUCCESS");
		return res;
	}
}
