package com.example.mybatisplus.Qo;

import lombok.Data;

import java.util.Date;

@Data
public class ModelQo {

    private Date startTime;

    private Date endTime;

    private Integer pageNO=0;

    private Integer pageSize=10;

    private String[] ascs;

    private String[] descs;

}
