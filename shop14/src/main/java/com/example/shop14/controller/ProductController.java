package com.example.shop14.controller;

import com.example.shop14.entity.Product;
import com.example.shop14.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @DeleteMapping("/products/{id}")
    public ResponseEntity<HttpStatus> deleteProduct(
            @PathVariable Long id
    )
    {
        productRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/products/{id}")
    public Optional<Product> getProductById(
            @PathVariable Long id
    )
    {
        return productRepository.findById(id);
    }

    // PUT http://localhost:8080/products
    @PutMapping("/products")
    public Product addProduct(
            @RequestBody Product product
    )
    {
        //проверить цену продукта - больше 0
        // проверить длину имени - не пустая и меньше или равна 50 символов
        return productRepository.save(product);
    }



}
