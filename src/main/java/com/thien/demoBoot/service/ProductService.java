/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thien.demoBoot.service;

import com.thien.demoBoot.entity.Products;
import com.thien.demoBoot.repository.ProductRepository;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProductServiceIF {

    @Autowired
    ProductRepository productRepo;

    @Override
    public List<Products> getListProducts() {
        return (List<Products>) productRepo.findAll();
    }

    @Override
    public void saveProduct(Products product) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Set<ConstraintViolation<Products>> violations = factory.getValidator().validate(product);
        if (violations.isEmpty()) {
            productRepo.save(product);
        } else {
            System.out.println("validate wrong, do not execute database script");
        }
    }

    @Override
    public Products getProductByID(int id) {
        return productRepo.findById(id);
    }

    @Override
    public void deleteProduct(int id) {
    }

    @Override
    public List<Products> getProductByName(String name) {
        return productRepo.findByProductName(name);
    }

}
