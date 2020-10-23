package com.jk.service;

import com.jk.entity.OrderEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("order-provider")
public interface OrderService {

    @RequestMapping("findOrder")
    public List<OrderEntity> findOrder();

    @RequestMapping("addOrder")
    public String addOrder(@RequestBody OrderEntity order);

    @RequestMapping("deleteById")
    public String deleteById(@RequestParam Integer orderId);

    @RequestMapping("findById")
    public OrderEntity findById(@RequestParam Integer orderId);
}
