package com.one.controller;

import com.one.entity.foodModel.Food;
import com.one.service.impl.FoodServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("food")
@Slf4j
@CrossOrigin
public class FoodController {

    @Autowired
    private FoodServiceImpl foodService;

    /**
     * 查找所有符合查找条件的床位
     * @param name
     * @return 空闲、预留、已占床位数量，返回某楼某楼层的床位信息
     */
    @PostMapping("getAllFoods")
    private Map<String,Object> getAllFood(@RequestParam(value = "name") String name){
        Map<String ,Object> map = new HashMap<>();
        List<Food> allFoods = foodService.getAllFoods(name);
        log.info("/old/food/getAllFoods查找到的食物[{}]",allFoods);
        map.put("allFoods",allFoods);
        return map;

    }
}
