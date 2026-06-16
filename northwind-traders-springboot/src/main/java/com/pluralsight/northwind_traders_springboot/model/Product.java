package com.pluralsight.northwind_traders_springboot.model;

//need to add to model

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer productId;
    private String name;
    private String category;
    private Double price;
}
