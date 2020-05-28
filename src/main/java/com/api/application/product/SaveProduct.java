package com.api.application.product;

import java.util.Date;

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
		Date date = new Date(System.currentTimeMillis());
		product.setDate(date);
		productRepository.insertProduct(product);
	}
}
