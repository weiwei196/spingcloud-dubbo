package com.jk.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderEntity implements Serializable {

    private Integer orderId;
    private String orderNumber;
    private String orderName;
    private String createTime;
    private Integer orderPrice;
    private Integer orderPay;

    private String payName;

}
