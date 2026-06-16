package com.pluralsight.northwind_traders_springboot.service;

import com.pluralsight.northwind_traders_springboot.model.Product;
import com.pluralsight.northwind_traders_springboot.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
//get all projects
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
//get product by id
    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }

    //add a new product para me
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    //delete a product by ID para me
    public void deleteProductsByID(int productId) {
        productRepository.deleteById(productId);
    }

}


