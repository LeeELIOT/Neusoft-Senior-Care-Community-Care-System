package com.one.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.entity.priceModel.Price;
import com.one.service.impl.PriceServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("price")
@Slf4j
@CrossOrigin
public class PriceController {

    @Autowired
    private PriceServiceImpl priceService;

    @PostMapping("getAllPrices")
    private Map<String,Object> getAllPrices(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
            @RequestParam(value = "id",required = false) Integer id){
        PageHelper.startPage(pn, 10);
        log.info("/old/price/getAllPrices参数为[{}]",id);
        Map<String,Object> map = new HashMap<>();
        List<Price> allPrices = priceService.getAllPrices(id);
        PageInfo<Price> pageInfo =new PageInfo<>(allPrices,5);
        if(ObjectUtils.isEmpty(allPrices)){
            map.put("status",false);
            map.put("pageInfo","");
        }else{
            map.put("status",false);
            map.put("pageInfo",pageInfo);
        }
        log.info("/old/price/getAllPrices结果为[{}]",map);
        return map;
    }

}
