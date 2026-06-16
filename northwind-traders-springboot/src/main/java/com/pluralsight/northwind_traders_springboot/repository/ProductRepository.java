package com.pluralsight.northwind_traders_springboot.repository;

import com.pluralsight.northwind_traders_springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
//added interface for products

        @Repository
        public interface ProductRepository extends JpaRepository<Product,Integer> {
            List<Product> findByproductIDIgnoreCase(Integer productID);
            List<Product> findByNameContainingIgnoreCase(String name);
            List<Product> findByCategoryIgnoreCase(String category);
            List<Product> findByPriceContainingIgnoreCase(Double price);

        }

