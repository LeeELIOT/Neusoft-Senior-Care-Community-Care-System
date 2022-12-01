package com.one.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.entity.healthyModel.Healthy;
import com.one.entity.hospitalModel.ToHospital;
import com.one.service.impl.HospitalServiceImpl;
import com.one.util.Utils;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.manager.host.HTMLHostManagerServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("toHospital")
@Slf4j
@CrossOrigin
public class HospitalController {

    @Autowired
    private HospitalServiceImpl hospitalService;

    @PostMapping("getAllToHospitals")
    private Map<String,Object> getAllHealthy(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                             @RequestParam(value = "name",required = false) String name){
        PageHelper.startPage(pn, 10);
        log.info("old/toHospital/getToHospital请求参数为[{}],[{}]",pn,name);
        name = Utils.toLike(name);
        Map<String,Object> map = new HashMap<>();
        List<ToHospital> allHospitals = hospitalService.getAllHospitals(name);
        PageInfo<ToHospital> pageInfo =new PageInfo<>(allHospitals,5);
        if(ObjectUtils.isEmpty(pageInfo)){
            map.put("status",false);
            map.put("pageInfo","");
        }else{
            map.put("status",true);
            map.put("pageInfo",pageInfo);
        }
        log.info("old/toHospital/getToHospital返回信息为[{}]",map);
        return map;
    }
}
