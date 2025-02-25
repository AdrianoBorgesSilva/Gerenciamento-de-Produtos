package com.example.product_manager.config;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.product_manager.domain.Product;
import com.example.product_manager.enums.ProductStatus;
import com.example.product_manager.repository.ProductRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

    @Autowired
    ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        
        productRepository.deleteAll();

        Product p1 = new Product(null, "iPhone 16", "Nosso modelo mais recente", new BigDecimal("799.00"), 15, ProductStatus.DISPONIVEL, "Apple", "Smartphone");
        Product p2 = new Product(null, "Samsung S23", "O melhor em tudo", new BigDecimal("399.99"), 25, ProductStatus.DISPONIVEL, "Samsung", "Smartphone");
        Product p3 = new Product(null, "RTX 4090", "Placa de vídeo de última geração", new BigDecimal("1999.00"), 10, ProductStatus.DISPONIVEL, "Nvidia", "Computers");
        Product p4 = new Product(null, "PlayStation 5", "Console de próxima geração", new BigDecimal("499.99"), 30, ProductStatus.DISPONIVEL, "Sony", "Electronics");
        Product p5 = new Product(null, "Air Max 90", "Tênis clássico da Nike", new BigDecimal("129.99"), 50, ProductStatus.DISPONIVEL, "Nike", "Clothing");
        Product p6 = new Product(null, "MacBook Pro 16", "Notebook de alta performance", new BigDecimal("2499.00"), 20, ProductStatus.DISPONIVEL, "Apple", "Computers");
        Product p7 = new Product(null, "Galaxy Watch 5", "Relógio inteligente premium", new BigDecimal("299.99"), 40, ProductStatus.DISPONIVEL, "Samsung", "Accessories");
        Product p8 = new Product(null, "GeForce RTX 3080", "Placa de vídeo para jogos", new BigDecimal("699.99"), 15, ProductStatus.DISPONIVEL, "Nvidia", "Computers");
        Product p9 = new Product(null, "WH-1000XM4", "Fones de ouvido com cancelamento de ruído", new BigDecimal("349.99"), 25, ProductStatus.DISPONIVEL, "Sony", "Electronics");
        Product p10 = new Product(null, "Air Force 1", "Tênis icônico da Nike", new BigDecimal("199.99"), 60, ProductStatus.DISPONIVEL, "Nike", "Clothing");
        Product p11 = new Product(null, "iPad Pro", "Tablet de alta performance", new BigDecimal("1900.00"), 18, ProductStatus.DISPONIVEL, "Apple", "Electronics");
        Product p12 = new Product(null, "Galaxy Buds 2", "Fones de ouvido sem fio", new BigDecimal("149.99"), 35, ProductStatus.DISPONIVEL, "Samsung", "Accessories");
        Product p13 = new Product(null, "RTX 3060", "Placa de vídeo acessível", new BigDecimal("329.99"), 20, ProductStatus.DISPONIVEL, "Nvidia", "Computers");
        Product p14 = new Product(null, "Bravia X90J", "TV 4K com Android TV", new BigDecimal("129.99"), 12, ProductStatus.DISPONIVEL, "Sony", "Electronics");
        Product p15 = new Product(null, "Jordan 1", "Tênis de basquete clássico", new BigDecimal("159.99"), 45, ProductStatus.DISPONIVEL, "Nike", "Clothing");
        Product p16 = new Product(null, "Apple Watch Series 8", "Relógio inteligente premium", new BigDecimal("399.99"), 22, ProductStatus.DISPONIVEL, "Apple", "Accessories");
        Product p17 = new Product(null, "Galaxy Tab S8", "Tablet Android de alta performance", new BigDecimal("699.99"), 15, ProductStatus.DISPONIVEL, "Samsung", "Electronics");
        Product p18 = new Product(null, "RTX 3070", "Placa de vídeo para jogos", new BigDecimal("499.99"), 18, ProductStatus.DISPONIVEL, "Nvidia", "Computers");
        Product p19 = new Product(null, "Alpha 7 IV", "Câmera mirrorless full-frame", new BigDecimal("2499.99"), 8, ProductStatus.DISPONIVEL, "Sony", "Electronics");
        Product p20 = new Product(null, "Tech Fleece", "Moletom esportivo", new BigDecimal("89.99"), 70, ProductStatus.DISPONIVEL, "Nike", "Clothing");

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20));
    }
    
}
