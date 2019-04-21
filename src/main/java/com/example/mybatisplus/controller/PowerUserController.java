package com.example.mybatisplus.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mybatisplus.Qo.ModelQo;
import com.example.mybatisplus.entity.PowerUser;
import com.example.mybatisplus.service.PowerUserService;
import com.example.mybatisplus.utils.JsonUtils;
import com.example.mybatisplus.utils.ResponseUtils;
import com.example.mybatisplus.utils.ResponseUtils.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zzulilgz
 * @since 2019-04-20
 */
@RestController
@RequestMapping("/user")
public class PowerUserController {
    private static Logger logger = LoggerFactory.getLogger(PowerUserController.class);

	@Autowired
    PowerUserService service;

    @GetMapping("/{id}")
    public Response<PowerUser> get(@PathVariable Integer id){
        PowerUser model = service.getById(id);
        return ResponseUtils.getSuccessJson(model);
    }
    @PostMapping
    public Response<Integer> save(@RequestBody PowerUser model){
        service.save(model);
        return ResponseUtils.getSuccessJson(model.getId());
    }
    @DeleteMapping("/{id}")
    public Response<Boolean> delete(@PathVariable Integer id){
        service.removeById(id);
        return ResponseUtils.getSuccessJson(true);
    }
    @PutMapping("/{id}")
    public Response<Boolean> update(@PathVariable Integer id,@RequestBody(required = false) PowerUser model){
        model.setId(id);
        service.updateById(model);
        return ResponseUtils.getSuccessJson(true);
    }
    @PostMapping("/list")
    public Response<IPage> find(@RequestBody(required = false) ModelQo modelQo){
        logger.info("/list request:{}",JsonUtils.toJson(modelQo));
        return ResponseUtils.getSuccessJson(service.find(modelQo));
    }
}
