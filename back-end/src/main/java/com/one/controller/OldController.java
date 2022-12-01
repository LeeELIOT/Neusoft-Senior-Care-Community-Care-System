package com.one.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.entity.estimateModel.Estimate;
import com.one.entity.healthyModel.Healthy;
import com.one.entity.oldModel.Old;
import com.one.service.impl.OldServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("older")
@Slf4j
@CrossOrigin
public class OldController {

    @Autowired
    private OldServiceImpl oldService;

    @PostMapping("getAllOlds")
    private Map<String,Object> getAllOlds(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                          @RequestParam(value = "name", required = false) String name){
        PageHelper.startPage(pn, 10);
        if (name == null) {
            name = "%%";
        }else{
            name = "%" + name + "%";
        }
        log.info("old/older/getAllOlds请求参数为[{}],[{}]", pn, name);
        Map<String, Object> map = new HashMap<>();
        List<Old> allOlds = oldService.getAllOlds(name);
        PageInfo<Old> pageInfo =new PageInfo<>(allOlds,5);
        if (ObjectUtils.isEmpty(allOlds)) {
            map.put("status", false);
            map.put("pageInfo", "");
        } else {
            map.put("status", true);
            map.put("pageInfo", pageInfo);
        }
        return map;
    }
}
