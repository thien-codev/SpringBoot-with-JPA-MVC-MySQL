/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thien.demoBoot.service;

import com.thien.demoBoot.entity.OrderDetails;
import com.thien.demoBoot.repository.OrderDetailRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class OrderDetailService implements OrderDetailServiceIF {

    @Autowired
    OrderDetailRepository orderDetailRepo;

    @Override
    public List<OrderDetails> getListOrderDetails() {
        return (List<OrderDetails>) orderDetailRepo.findAll();
    }

    @Override
    public void saveOrderDetail(OrderDetails question) {
    }

    @Override
    public OrderDetails getOrderDetailByID(int id) {
        return orderDetailRepo.findById(id);
    }

    @Override
    public void deleteOrderDetail(int id) {
    }

    @Override
    public List<OrderDetails> getListOrderDetailByOrderId(int orderId) {
        return orderDetailRepo.findByOrderId(orderId);
    }

    @Override
    public OrderDetails getOrderDetailsByProId(int id) {
        return orderDetailRepo.findByProId(id);
    }

}
