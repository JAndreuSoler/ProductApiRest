package com.api.controllers.product.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.application.product.DeleteProduct;

@RestController
public class DeleteProductController {
	
	@Autowired
	DeleteProduct service;

	@DeleteMapping("/product/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	

}
