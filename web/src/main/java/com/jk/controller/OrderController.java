package com.jk.controller;

import com.jk.entity.OrderEntity;
import com.jk.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("find")
    public String find(Model model){
        model.addAttribute("orderList",orderService.findOrder());
        return "list";
    }

    @RequestMapping("add")
    public String add(OrderEntity order){
        orderService.addOrder(order);
        return "redirect:find";
    }

    @RequestMapping("del")
    public String del(Integer orderId){
        orderService.deleteById(orderId);
        return "redirect:find";
    }

    @RequestMapping("findById")
    public String findById(Integer orderId,Model model){
        model.addAttribute("order",orderService.findById(orderId));
        return "add";
    }
}
