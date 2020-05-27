package com.api.infrastructure.product.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.domain.product.model.Product;

public interface JpaProductRepository extends JpaRepository<Product, Long> {

}
