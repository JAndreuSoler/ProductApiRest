package com.api.application.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.domain.product.repository.ProductRepository;

@Service
public class DeleteProduct {

	private ProductRepository productRepository;

	@Autowired
	public DeleteProduct(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	
	public void delete(long id){
		productRepository.deleteProduct(id);
	}
	
}
