package com.api.controllers.product.put;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.application.product.UpdateProduct;
import com.api.domain.product.model.Product;

@RestController
public class PutProductController {
	
	@Autowired
	UpdateProduct service;
	
	@PutMapping("/product/{id}")
	public ResponseEntity<?> putProduct(@RequestBody Product product, @PathVariable long id) {
		ResponseEntity<?> response;
		Product p = service.update(product, id);
		
		response = (p == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(p);
		
		return response;
	}

}
