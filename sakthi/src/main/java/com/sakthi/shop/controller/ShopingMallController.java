package com.sakthi.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakthi.shop.entity.CustomerModel;
import com.sakthi.shop.reqresp.Response;
import com.sakthi.shop.reqresp.Request;
import com.sakthi.shop.service.ShoppingMallService;

@RestController
@RequestMapping("/sakthi")
public class ShopingMallController {
	@Autowired
	private ShoppingMallService shoppingMallService;

	@GetMapping(value = "/getCustomerDetails")

	public List<CustomerModel> getCustomerDetails() {

		return shoppingMallService.getCustomerDetails();
	}

	@PostMapping(value = "/insertCustomerDetails")
	public Response insertCustomerDetails(@RequestBody Request req) {

		return shoppingMallService.insertCustomerDetails(req);
	}

	@PostMapping(value = "/updateCustomerDetails")
	public Response updateCustomerDetails(@RequestBody Request req) {

		return shoppingMallService.updateCustomerDetails(req);
	}

	@DeleteMapping(value = "/deleteCustomerDetails/{customerid}")
	public Response deleteCustomerDetails(@PathVariable int customerid) {

		return shoppingMallService.deleteCustomerDetails(customerid);
	}

}
