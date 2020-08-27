package com.thien.demoBoot.service;

import com.thien.demoBoot.entity.Orders;
import java.util.Date;
import java.util.List;

public interface OrderServiceIF {

    public List<Orders> getListOrders();

    public void saveOrder(Orders question);

    public Orders getOrderByID(int id);

    public void deleteOrder(int id);

    public List<Orders> getOrdersByCustomerName(String name);

    public List<Orders> getOrdersByOrderDate(Date date);
}
