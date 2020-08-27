/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thien.demoBoot.service;

import com.thien.demoBoot.entity.OrderDetails;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface OrderDetailServiceIF {

    public List<OrderDetails> getListOrderDetails();

    public void saveOrderDetail(OrderDetails question);

    public OrderDetails getOrderDetailByID(int id);

    public void deleteOrderDetail(int id);

    public List<OrderDetails> getListOrderDetailByOrderId(int orderId);

    public OrderDetails getOrderDetailsByProId(int id);
}
