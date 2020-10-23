package com.jk.service;

import com.jk.entity.OrderEntity;

import java.util.List;

public interface OrderService {
    List<OrderEntity> findOrder();

    void addOrder(OrderEntity order);

    void deleteById(Integer orderId);

    OrderEntity findById(Integer orderId);
}
