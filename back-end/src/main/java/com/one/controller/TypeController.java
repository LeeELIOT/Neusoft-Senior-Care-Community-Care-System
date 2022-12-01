package com.one.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.entity.Type;
import com.one.entity.oldModel.OldType;
import com.one.entity.priceModel.PriceType;
import com.one.entity.staffModel.StaffType;
import com.one.service.impl.TypeServiceImpl;
import com.one.util.Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("type")
@Slf4j
@CrossOrigin
public class TypeController {

    @Autowired
    private TypeServiceImpl typeService;

    @PostMapping("getAllTypes")
    private Map<String, Object> getAllTypes(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                            @RequestParam(value = "name",required = false)  String name) {
        name = Utils.toLike(name);
        PageHelper.startPage(pn, 10);
        log.info("old/type/getAllTypes请求参数为[{}],[{}]",pn,name);
        Map<String,Object> map = new HashMap<>();
        List<OldType> allOldTypes = typeService.getAllOldTypes(name);
        List<PriceType> allPriceTypes = typeService.getAllPriceTypes(name);
        List<StaffType> allStaffTypes = typeService.getAllStaffTypes(name);
        List<Type> types = new LinkedList<>();
        types.addAll(allOldTypes);
        types.addAll(allPriceTypes);
        types.addAll(allStaffTypes);
        PageInfo<Type> pageInfo =new PageInfo<>(types,5);
        if(ObjectUtils.isEmpty(pageInfo)){
            map.put("status",false);
            map.put("pageInfo","");
        }else{
            map.put("status",true);
            map.put("pageInfo",pageInfo);
        }
        log.info("old/type/getAllTypes返回信息为[{}]",map);
        return map;

    }
}
