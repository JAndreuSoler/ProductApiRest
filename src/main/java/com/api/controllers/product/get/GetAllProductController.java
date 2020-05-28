package com.api.controllers.product.get;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.application.product.GetAllProduct;
import com.api.domain.product.model.Product;

@RestController
public class GetAllProductController {

	@Autowired
	GetAllProduct service;
	
	@GetMapping("/product")
	public ResponseEntity<?> getAllProduct(){
		ResponseEntity<?> response;
		List<Product> list = service.getAllProduct();
		
		response = (list.isEmpty()) ? ResponseEntity.notFound().build() 
				: ResponseEntity.ok(list);
		
		return response;
	}
}
