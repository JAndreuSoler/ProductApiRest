package com.api.application.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.domain.product.model.Product;
import com.api.domain.product.repository.ProductRepository;

@Service
public class GetProduct {

	private ProductRepository productRepository;

	@Autowired
	public GetProduct(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public Product get(long id) {
		return productRepository.getProduct(id);
	}
	
}
