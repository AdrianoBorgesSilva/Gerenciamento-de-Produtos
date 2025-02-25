package com.example.product_manager.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.product_manager.domain.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

    List<Product> findByBrand(String brandName);
    List<Product> findByCategory(String categoryName);
} 
