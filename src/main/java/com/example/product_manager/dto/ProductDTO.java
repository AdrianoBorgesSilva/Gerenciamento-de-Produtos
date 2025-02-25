package com.example.product_manager.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.example.product_manager.domain.Product;
import com.example.product_manager.enums.ProductStatus;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDTO implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private String id;

    @NotBlank(message = "Nome é obrigatório")
    private String name;

    private String description; //Descrição pode ser null
    
    @PositiveOrZero(message = "Preço dever ser maior ou igual a zero")
    private BigDecimal price;

    @PositiveOrZero(message = "Quantidade deve ser maior ou igual a zero")
    private int quantity;
    
    @NotBlank(message = "Marca é obrigatório")
    private String brand;

    @NotBlank(message = "Categoria é obrigatório")
    private String category;

    @NotNull(message = "Status do produto é obrigatório")
    private ProductStatus status;

    public ProductDTO(Product obj) {
        this.id = obj.getId();
        this.name = obj.getName();
        this.description = obj.getDescription();
        this.price = obj.getPrice();
        this.quantity = obj.getQuantity();
        this.brand = obj.getBrand();
        this.category = obj.getCategory();
        this.status = obj.getStatus();
    }
}
