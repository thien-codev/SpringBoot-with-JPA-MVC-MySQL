/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thien.demoBoot.repository;

import com.thien.demoBoot.entity.OrderDetails;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends CrudRepository<OrderDetails, Integer> {

    public OrderDetails findById(int id);

    public List<OrderDetails> findByOrderId(int orderId);

    @Query("select o from OrderDetails o where o.product.id = ?1")
    public OrderDetails findByProId(int id);
}
