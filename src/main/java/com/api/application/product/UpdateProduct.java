package com.api.application.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.domain.product.model.Product;
import com.api.domain.product.repository.ProductRepository;

@Service
public class UpdateProduct {

	ProductRepository productRepository;

	@Autowired
	public UpdateProduct(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public Product update(Product product, long id) {
		Product p = productRepository.getProduct(id);
		
		if( p == null )
			return null;
		
		p.setName(product.getName());
		p.setDescription(product.getDescription());
		
		return productRepository.insertProduct(p);
	}
	
}
