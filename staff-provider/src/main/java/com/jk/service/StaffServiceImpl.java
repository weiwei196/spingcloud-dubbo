package com.jk.service;

import com.jk.entity.StaffEntity;
import com.jk.mapper.StaffMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService{

    @Resource
    private StaffMapper staffMapper;

    @Override
    public List<StaffEntity> findStaff() {
        return staffMapper.findStaff();
    }

    @Override
    public void addStaff(StaffEntity staff) {
        if (staff.getStaffId() == null){
            staffMapper.addStaff(staff);
        }else{
            staffMapper.updateStaff(staff);
        }

    }

    @Override
    public void deleteById(Integer staffId) {
        staffMapper.deleteById(staffId);
    }

    @Override
    public StaffEntity findById(Integer staffId) {
        return staffMapper.findById(staffId);
    }
}
