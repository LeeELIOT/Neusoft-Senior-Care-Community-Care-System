package com.one.service.impl;

import com.one.dao.foodModel.FoodDao;
import com.one.entity.foodModel.Food;
import com.one.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodDao foodDao;

    @Override
    public List<Food> getAllFoods(String name) {
        return foodDao.getAllFoods(name);
    }
}
