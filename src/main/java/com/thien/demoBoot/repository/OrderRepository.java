/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thien.demoBoot.repository;

import com.thien.demoBoot.entity.Orders;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer> {

    public Orders findById(int id);

    @Query("select o from Orders o where o.customerName like %?1%")
    public List<Orders> getOrdersByCustomerName(String name);

    public List<Orders> findByOrderDate(Date date);

}
