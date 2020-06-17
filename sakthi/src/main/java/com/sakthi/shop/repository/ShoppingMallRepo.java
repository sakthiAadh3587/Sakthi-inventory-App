package com.sakthi.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sakthi.shop.entity.CustomerModel;

public interface ShoppingMallRepo extends JpaRepository<CustomerModel, Integer>  {
	
	
					

}