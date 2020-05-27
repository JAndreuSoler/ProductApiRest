package com.api.infrastructure.product.jparepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.domain.product.model.Product;
import com.api.domain.product.repository.ProductRepository;

@Component
public class H2JpaProductRepository implements ProductRepository {

	@Autowired
	JpaProductRepository repository;

	@Override
	public List<Product> getAll() {
		return repository.findAll();
	}

	@Override
	public Product getProduct(long id) {
		Product p = repository.findById(id).orElse(null);
		return p;
	}

	@Override
	public void deleteProduct(long id) {
		repository.delete(getProduct(id));

	}

	@Override
	public void insertProduct(Product product) {
		repository.save(product);
	}

}
