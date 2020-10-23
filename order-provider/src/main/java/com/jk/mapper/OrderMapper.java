package com.jk.mapper;

import com.jk.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<OrderEntity> findOrder();

    void addOrder(OrderEntity order);

    void deleteById(Integer orderId);

    OrderEntity findById(Integer orderId);

    void updateOrder(OrderEntity order);
}
