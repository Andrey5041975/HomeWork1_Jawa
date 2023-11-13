package com.example.shop24;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {



//        Iterable<Product> findByNameContaining(String text);
//
//        Iterable<Product> findByPriceBetween(BigDecimal from, BigDecimal to);
    }

