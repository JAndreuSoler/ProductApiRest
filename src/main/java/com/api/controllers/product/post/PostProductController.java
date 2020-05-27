package com.api.controllers.product.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.application.product.SaveProduct;
import com.api.domain.product.model.Product;

@RestController
public class PostProductController {
	
	@Autowired
	SaveProduct service;
	
	@PostMapping("product")
	public Product postProduct(@RequestBody Product product) {
		service.save(product);
		return product;
	}

}
