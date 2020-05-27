package com.api.application.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.domain.product.model.Product;
import com.api.domain.product.repository.ProductRepository;

@Service
public class GetAllProduct {
	
	private ProductRepository productRepository;

	@Autowired
	public GetAllProduct(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	
	public List<Product> getAllProduct(){
		return productRepository.getAll();
	}
	
	

}
