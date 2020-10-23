package com.jk.mapper;

import com.jk.entity.StaffEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StaffMapper {

    List<StaffEntity> findStaff();

    void addStaff(StaffEntity staff);

    void updateStaff(StaffEntity staff);

    void deleteById(Integer staffId);

    StaffEntity findById(Integer staffId);
}
