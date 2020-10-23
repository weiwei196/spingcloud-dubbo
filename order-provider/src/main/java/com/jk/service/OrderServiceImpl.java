package com.jk.service;

import com.jk.entity.OrderEntity;
import com.jk.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<OrderEntity> findOrder() {
        return orderMapper.findOrder();
    }

    @Override
    public void addOrder(OrderEntity order) {
        if (order.getOrderId() == null){
            orderMapper.addOrder(order);
        }else{
            orderMapper.updateOrder(order);
        }

    }

    @Override
    public void deleteById(Integer orderId) {
        orderMapper.deleteById(orderId);
    }

    @Override
    public OrderEntity findById(Integer orderId) {
        return orderMapper.findById(orderId);
    }
}
