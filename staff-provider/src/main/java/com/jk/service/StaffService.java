package com.jk.service;

import com.jk.entity.StaffEntity;

import java.util.List;

public interface StaffService {
    List<StaffEntity> findStaff();

    void addStaff(StaffEntity staff);

    void deleteById(Integer staffId);

    StaffEntity findById(Integer staffId);
}
