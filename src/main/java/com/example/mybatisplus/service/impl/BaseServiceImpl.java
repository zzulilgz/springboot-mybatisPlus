package com.example.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.Qo.ListByPageQo;

/**
 * @Description TODO
 * @Author gaozhi.liu
 * @Date 2019/4/22 11:04
 * @Version 1.0
 **/
public class BaseServiceImpl<M extends BaseMapper<T>,T> extends ServiceImpl<M, T> {

    protected void setQueryTimeType(QueryWrapper queryWrapper, ListByPageQo reqQo,String dateType) {
        if(reqQo.getStartTime()!=null){
            queryWrapper.ge(dateType,reqQo.getStartTime());
        }
        if(reqQo.getEndTime()!=null){
            queryWrapper.le(dateType,reqQo.getEndTime());
        }
    }
    protected Page initPage(ListByPageQo reqQo) {
        Page page = new Page(reqQo.getPageNo(),reqQo.getPageSize());

        if(reqQo.getAscs()!=null){
            page.setAsc(reqQo.getAscs());
        }
        if(reqQo.getDescs()!=null){
            page.setDesc(reqQo.getDescs());
        }
        return page;
    }
}
