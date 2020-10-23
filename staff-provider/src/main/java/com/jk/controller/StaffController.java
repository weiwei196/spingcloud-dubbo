package com.jk.controller;

import com.jk.entity.OrderEntity;
import com.jk.entity.StaffEntity;
import com.jk.service.StaffService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StaffController {

    @Resource
    private StaffService staffService;

    @RequestMapping("findStaff")
    public List<StaffEntity> findStaff(){
        return staffService.findStaff();
    }

    @RequestMapping("addStaff")
    public String addStaff(@RequestBody StaffEntity staff){
        staffService.addStaff(staff);
        return "success";
    }

    @RequestMapping("deleteById")
    public String deleteById(@RequestParam Integer staffId){
        staffService.deleteById(staffId);
        return "success";
    }

    @RequestMapping("findById")
    public StaffEntity findById(@RequestParam Integer staffId){
        return staffService.findById(staffId);
    }
}
