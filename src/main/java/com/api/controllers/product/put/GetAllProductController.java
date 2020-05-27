package com.api.controllers.product.put;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.application.product.GetAllProduct;
import com.api.domain.product.model.Product;

@RestController
public class GetAllProductController {

	@Autowired
	GetAllProduct service;
	
	@GetMapping("/product/all")
	public List<Product> getAllProduct(){
		return service.getAllProduct();
	}
}
