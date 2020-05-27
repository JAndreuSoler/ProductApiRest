package com.api;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.api.domain.product.model.Product;
import com.api.infrastructure.product.jparepository.JpaProductRepository;

@SpringBootApplication
public class ProductApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApiRestApplication.class, args);
	}

	@Bean
	CommandLineRunner init(JpaProductRepository jpaProductRepository) {
		return (args) -> {
			Product p = new Product("test", "test desc", null, new Date());

			jpaProductRepository.save(p);
		};

	}

}
