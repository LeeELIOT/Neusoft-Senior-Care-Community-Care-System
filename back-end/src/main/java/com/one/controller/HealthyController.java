package com.one.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.entity.healthyModel.Healthy;
import com.one.service.impl.HealthyServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("healthy")
@CrossOrigin
@Slf4j
public class HealthyController {

    @Autowired
    private HealthyServiceImpl healthyService;


    /**
     * 查找符合查找条件的健康档案
     * @param pn 分页的页数
     * @param id 档案号
     * @return 把分页后的数据返回给前端
     */
    @PostMapping("getAllHealthy")
    private Map<String,Object> getAllHealthy(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                        @RequestParam(value = "id",required = false) Integer id){
        PageHelper.startPage(pn, 10);
        log.info("old/healthy/getAllHealthy请求参数为[{}],[{}]",pn,id);
        Map<String,Object> map = new HashMap<>();
        List<Healthy> allHealthy = healthyService.getAllHealthy(id);
        PageInfo<Healthy> pageInfo =new PageInfo<>(allHealthy,5);
        if(ObjectUtils.isEmpty(pageInfo)){
            map.put("status",false);
            map.put("pageInfo","");
        }else{
            map.put("status",true);
            map.put("pageInfo",pageInfo);
        }
        log.info("old/healthy/getAllHealthy返回信息为[{}]",map);
        return map;
    }
}
