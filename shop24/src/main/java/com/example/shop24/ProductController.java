package com.example.shop24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Создайте контроллер (@RestController) ProductController с методами
public Product createProduct(Product) // POST /products
public void deleteProduct(Long id) // DELETE /products/{id}
public Product getProductByProductId(Long id) // GET /products/{id}
public Product updateComment(Long id, Product product) // PUT /products/{id}


 */
@RestController
public class ProductController {
    private List<Product> products = new ArrayList<>();
    public ProductController(){

//        products.add(new Product("book 1 ", BigDecimal.valueOf(10.1), true));
//        products.add(new Product("book 2 ", BigDecimal.valueOf(11.2), true));
    products.addAll(
            Arrays.asList(new Product("book 1 ",BigDecimal.valueOf(10.1), true),
                          new Product("book 2", BigDecimal.valueOf(11.2), true),
                          new Product("book 3", BigDecimal.valueOf(12.3), true),
                          new Product("book 4", BigDecimal.valueOf(14.4), true),
                          new Product("book 5", BigDecimal.valueOf(15.5), true)
            )
    );
    }

    @Autowired
    private ProductRepository productRepository;
    @PostMapping("/products")

    public Product createProduct(Product product)
    {
        products.add(product);
      return product;
    } // POST /products
    @DeleteMapping("/products/{id}")
    public void deleteProduct(Long id) {}; // DELETE /products/{id}

    @GetMapping("/products/{id}")
    public Product getProductByProductId(Long id){return  null;} // GET /products/{id}
    @PostMapping("/products/{id}")
    public Product updateComment(Long id, Product product){return null;}; // PUT /products/{id}

}
