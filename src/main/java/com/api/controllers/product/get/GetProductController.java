package com.api.controllers.product.get;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.application.product.GetProduct;
import com.api.domain.product.model.Product;

@RestController
public class GetProductController {
	
	@Autowired
	GetProduct service;
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable long id) {
		return service.get(id);
	}

}
