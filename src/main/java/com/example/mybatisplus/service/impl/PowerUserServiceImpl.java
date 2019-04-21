package com.example.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.Qo.ModelQo;
import com.example.mybatisplus.dao.PowerUserDao;
import com.example.mybatisplus.entity.PowerUser;
import com.example.mybatisplus.service.PowerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zzulilgz
 * @since 2019-04-20
 */
@Service
public class PowerUserServiceImpl extends ServiceImpl<PowerUserDao, PowerUser> implements PowerUserService {

    @Autowired
    PowerUserDao userDao;
    @Override
    public IPage find(ModelQo modelQo){

        QueryWrapper<PowerUser> queryWrapper = new QueryWrapper<>();

        if(modelQo.getStartTime()!=null){
            queryWrapper.ge("create_time",modelQo.getStartTime());
        }
        if(modelQo.getEndTime()!=null){
            queryWrapper.le("create_time",modelQo.getEndTime());
        }
        return userDao.selectPage(getPage(modelQo),queryWrapper);
    }

    private Page getPage(ModelQo modelQo) {
        Page page = new Page(modelQo.getPageNO(),modelQo.getPageSize());
        if(modelQo.getAscs()!=null){
           page.setAsc();
        }
        if(modelQo.getDescs()!=null){
            page.setDesc(modelQo.getDescs());
        }
        return page;
    }
}
