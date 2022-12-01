package com.one.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.entity.staffModel.Job;
import com.one.entity.staffModel.Staff;
import com.one.service.impl.StaffServiceImpl;
import com.one.util.Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("staff")
@Slf4j
@CrossOrigin
public class StaffController {

    @Autowired
    private StaffServiceImpl staffService;

    @PostMapping("getAllStaffs")
    private Map<String,Object> getAllStaffs(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                            @RequestParam(value = "staffTypeName") String staffTypeName,
                                            @RequestParam(value = "name",required = false) String name){
        name = Utils.toLike(name);
        PageHelper.startPage(pn, 10);
        log.info("old/staff/getAllStaffs请求参数为[{}],[{}],[{}]",pn,staffTypeName,name);
        Map<String,Object> map = new HashMap<>();
        List<Staff> allStaffs = staffService.getAllStaffs(staffTypeName,name);
        PageInfo<Staff> pageInfo =new PageInfo<>(allStaffs,5);
        if(ObjectUtils.isEmpty(pageInfo)){
            map.put("status",false);
            map.put("pageInfo","");
        }else{
            map.put("status",true);
            map.put("pageInfo",pageInfo);
        }
        log.info("old/staff/getAllStaffs返回信息为[{}]",map);
        return map;
    }


    @PostMapping("getJob")
    private Map<String,Object> getAllStaffs(@RequestParam(value = "StaffId",required = false) Integer StaffId){
        log.info("old/staff/getAllStaffs请求参数为[{}]",StaffId);
        Map<String,Object> map = new HashMap<>();
        Job job = staffService.getJob(StaffId);
        log.info("old/staff/getJob返回信息为[{}]",job);
        if(ObjectUtils.isEmpty(job)){
            map.put("status",false);
            map.put("job","");
        }else{
            map.put("status",true);
            map.put("job",job);
        }
        return map;
    }
}
