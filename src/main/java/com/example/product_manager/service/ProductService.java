package com.example.product_manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product_manager.domain.Product;
import com.example.product_manager.dto.ProductDTO;
import com.example.product_manager.exception.ObjectNotFoundException;
import com.example.product_manager.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(String id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElseThrow(() -> new ObjectNotFoundException("Produto não encontrado"));
    }

    public List<Product> findByBrand(String brandName) {
        return productRepository.findByBrand(brandName);
    }

    public List<Product> findByCategory(String categoryName) {
        return productRepository.findByCategory(categoryName);
    }
    
    public Product insert(Product product) {
        return productRepository.insert(product);
    }

    public void delete(String id) {
        findById(id);
        productRepository.deleteById(id);
    }

    public Product update(Product product) {
        Product newProduct = findById(product.getId());
        updateData(newProduct, product);
        return productRepository.save(newProduct);
    }

    public void updateData(Product newProduct, Product product){
        newProduct.setName(product.getName());
        newProduct.setDescription(product.getDescription());
        newProduct.setPrice(product.getPrice());
        newProduct.setQuantity(product.getQuantity());
        newProduct.setCategory(product.getCategory());
        newProduct.setBrand(product.getBrand());
        newProduct.setStatus(product.getStatus());
    }

    public Product fromDTO(ProductDTO productDTO) {
        return new Product(productDTO.getId(), productDTO.getName(), productDTO.getDescription(), productDTO.getPrice(), productDTO.getQuantity(), productDTO.getStatus(), productDTO.getBrand(), productDTO.getCategory());
    }
}
