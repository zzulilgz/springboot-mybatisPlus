package com.example.mybatisplus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mybatisplus.entity.PowerUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatisplus.Qo.ModelQo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zzulilgz
 * @since 2019-04-20
 */
public interface PowerUserService extends IService<PowerUser> {

    IPage find(ModelQo modelQo);
}
