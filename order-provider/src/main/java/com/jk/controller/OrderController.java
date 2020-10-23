package com.jk.controller;

import com.jk.entity.OrderEntity;
import com.jk.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("findOrder")
    public List<OrderEntity> findOrder(){
        return orderService.findOrder();
    }

    @RequestMapping("addOrder")
    public String addOrder(@RequestBody OrderEntity order){
        orderService.addOrder(order);
        return "success";
    }

    @RequestMapping("deleteById")
    public String deleteById(@RequestParam Integer orderId){
        orderService.deleteById(orderId);
        return "success";
    }

    @RequestMapping("findById")
    public OrderEntity findById(@RequestParam Integer orderId){
        return orderService.findById(orderId);
    }
}
