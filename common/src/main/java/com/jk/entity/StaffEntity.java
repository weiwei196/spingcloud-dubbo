package com.jk.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class StaffEntity implements Serializable {

    private Integer staffId;
    private String staffName;
    private Integer staffSection;
    private String entryTime;
    private String staffPost;
    private String staffDuty;

    private String sectionName;
}
