/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thien.demoBoot.service;

import com.thien.demoBoot.entity.Products;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ProductServiceIF {

    public List<Products> getListProducts();

    public void saveProduct(Products question);

    public Products getProductByID(int id);

    public void deleteProduct(int id);

    public List<Products> getProductByName(String name);
}
