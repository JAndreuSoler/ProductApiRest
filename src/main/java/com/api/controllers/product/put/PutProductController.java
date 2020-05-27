package com.api.controllers.product.put;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.application.product.UpdateProduct;
import com.api.domain.product.model.Product;

@RestController
public class PutProductController {
	
	@Autowired
	UpdateProduct service;
	
	@PutMapping
	public Product putProduct(@RequestBody Product product) {
		service.update(product);
		return product;
	}

}
