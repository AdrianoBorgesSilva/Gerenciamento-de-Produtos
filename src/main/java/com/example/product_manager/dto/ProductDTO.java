package com.example.product_manager.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.example.product_manager.domain.Product;
import com.example.product_manager.enums.ProductStatus;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

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

    public ProductDTO() {

    }

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

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }
}
