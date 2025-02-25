package com.example.product_manager.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.product_manager.domain.Product;
import com.example.product_manager.dto.ProductDTO;

@Mapper
public interface ProductMapper {
    
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDTO(Product product);

    Product toEntity(ProductDTO productDTO);
}
