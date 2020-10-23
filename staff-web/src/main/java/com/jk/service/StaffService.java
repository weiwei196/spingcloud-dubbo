package com.jk.service;

import com.jk.entity.StaffEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("staff-provider")
public interface StaffService {

    @RequestMapping("findStaff")
    public List<StaffEntity> findStaff();

    @RequestMapping("addStaff")
    public String addStaff(@RequestBody StaffEntity staff);

    @RequestMapping("deleteById")
    public String deleteById(@RequestParam Integer staffId);

    @RequestMapping("findById")
    public StaffEntity findById(@RequestParam Integer staffId);
}
