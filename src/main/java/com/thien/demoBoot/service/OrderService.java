/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thien.demoBoot.service;

import com.thien.demoBoot.entity.Orders;
import com.thien.demoBoot.repository.OrderRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class OrderService implements OrderServiceIF {

    @Autowired
    OrderRepository orderService;

    @Override
    public List<Orders> getListOrders() {
        return (List) orderService.findAll();
    }

    @Override
    public void saveOrder(Orders question) {
    }

    @Override
    public Orders getOrderByID(int id) {
        return orderService.findById(id);
    }

    @Override
    public void deleteOrder(int id) {
    }

    @Override
    public List<Orders> getOrdersByCustomerName(String name) {
        return orderService.getOrdersByCustomerName(name);
    }

    @Override
    public List<Orders> getOrdersByOrderDate(Date date) {
        return orderService.findByOrderDate(date);
    }

}
