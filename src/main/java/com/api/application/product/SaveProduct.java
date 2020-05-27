package com.api.application.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.domain.product.model.Product;
import com.api.domain.product.repository.ProductRepository;

@Service
public class SaveProduct {

	ProductRepository productRepository;

	@Autowired
	public SaveProduct(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public void save(Product product) {
		productRepository.insertProduct(product);
	}
}
