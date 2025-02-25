package com.example.product_manager.resource;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.product_manager.domain.Product;
import com.example.product_manager.dto.ProductDTO;
import com.example.product_manager.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/products")
public class ProductResource {
    
    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll() {
       List<Product> list = productService.findAll(); 
       List<ProductDTO> listDTO = list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
       return ResponseEntity.ok().body(listDTO);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable String id) {
        Product product = productService.findById(id); 
        return ResponseEntity.ok().body(new ProductDTO(product));
    } 

    @GetMapping(value = "/brand/{brandName}")
    public ResponseEntity<List<ProductDTO>> findByBrand(@PathVariable String brandName) {
        List<Product> list = productService.findByBrand(brandName);
        List<ProductDTO> listDTO = list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @GetMapping(value = "/category/{categoryName}")
    public ResponseEntity<List<ProductDTO>> findByCategory(@PathVariable String categoryName) {
        List<Product> list = productService.findByCategory(categoryName);
        List<ProductDTO> listDTO = list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody ProductDTO productDTO) {
        Product product = productService.fromDTO(productDTO);
        product = productService.insert(product);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(product.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@Valid @RequestBody ProductDTO productDTO, @PathVariable String id) {
        Product product = productService.fromDTO(productDTO);
        product.setId(id);
        product = productService.update(product);
        return ResponseEntity.noContent().build();
    }
}
