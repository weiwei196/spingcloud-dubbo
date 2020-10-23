package com.jk.controller;

import com.jk.entity.StaffEntity;
import com.jk.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class StaffController {

    @Resource
    private StaffService staffService;

    @RequestMapping("find")
    public String find(Model model){
        model.addAttribute("staffList",staffService.findStaff());
        return "list";
    }

    @RequestMapping("add")
    public String add(StaffEntity staff){
        staffService.addStaff(staff);
        return "redirect:find";
    }

    @RequestMapping("del")
    public String del(Integer staffId){
        staffService.deleteById(staffId);
        return "redirect:find";
    }

    @RequestMapping("findById")
    public String findById(Integer staffId,Model model){
        model.addAttribute("staff",staffService.findById(staffId));
        return "add";
    }
}
