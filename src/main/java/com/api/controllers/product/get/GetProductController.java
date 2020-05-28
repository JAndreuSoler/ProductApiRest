package com.api.controllers.product.get;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<?> getProduct(@PathVariable long id) {
		ResponseEntity<?> response;
		Product product = service.get(id);
		
		response = (product == null) ? ResponseEntity.notFound().build() 
				: ResponseEntity.ok(product);
		
		return response;
	}

}
