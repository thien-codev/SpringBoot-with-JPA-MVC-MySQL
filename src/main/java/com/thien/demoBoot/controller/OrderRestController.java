
package com.thien.demoBoot.controller;

import com.thien.demoBoot.entity.Orders;
import com.thien.demoBoot.service.OrderService;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/orders")
public class OrderRestController {
    @Autowired
    OrderService orderService;
    
    @GetMapping
    public Object showListOfOrder() {
        return orderService.getListOrders();
    }
    
    @PostMapping
    public Object saveOrders(@RequestBody Orders order){
        orderService.saveOrder(order);
        return new HashMap<String,String>().put("message", "Success");
    }
    
    @PutMapping
    public Object updateOrder(@RequestBody Orders order) {

	HashMap rt = new HashMap();
	Orders orderRt = orderService.getOrderByID(order.getId());
	if (orderRt != null) {
	    orderService.saveOrder(order);
	    rt.put("message", "success");
	} else {
	    rt.put("message", "Order not found");
	}
	return rt;
    }
    
    @DeleteMapping(value = "/{id}")
    public Object deleteOrder(@PathVariable("id") int id) {
	HashMap rt = new HashMap();
	Orders orderRt = orderService.getOrderByID(id);
	if (orderRt != null) {
	    orderService.deleteOrder(id);
	    rt.put("message", "success");
	} else {
	    rt.put("message", "Order not found");
	}
	return rt;
    }
    
    @GetMapping(value = "/{id}")
    public Object getCustomer(@PathVariable("id") int id) {
	return orderService.getOrderByID(id);
    }
}
