package com.jk.controller;

import com.jk.entity.OrderEntity;
import com.jk.entity.StaffEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpController {

    @RequestMapping("toList")
    public String toList(){
        return "list";
    }

    @RequestMapping("toAdd")
    public String toAdd(Model model){
        model.addAttribute("staff",new StaffEntity());
        return "add";
    }
}
