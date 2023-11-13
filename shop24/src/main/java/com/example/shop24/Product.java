package com.example.shop24;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
public class Product {

    @Id
    private Long id; //(@Id)
    private String name;
    private BigDecimal price;
    private boolean isActive;

//    public Product(String name, BigDecimal price, boolean isActive) {
//        this();
//        this.name = name;
//        this.price = price;
//        this.isActive = isActive;
//    }

    public Product(String name, BigDecimal price, boolean isActive) {
        this();
        this.name = name;
        this.price = price;
        this.isActive = isActive;
    }

    public Product() {
        id = UUID.randomUUID().getLeastSignificantBits();
                //.timestamp();
    }

    public Long getId() {
        return id;
    }

    /*
    public void setId(Long id) {
        this.id = id;
    }

     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public boolean isActive() {
//        return isActive;
//    }
//
//    public void setActive(boolean active) {
//        isActive = active;
//    }


}
