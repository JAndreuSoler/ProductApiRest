package com.api.domain.product.repository;

import java.util.List;

import com.api.domain.product.model.Product;

public interface ProductRepository {

	public List<Product> getAll();

	public Product getProduct(long id);

	public void deleteProduct(long id);

	public Product insertProduct(Product product);
}
