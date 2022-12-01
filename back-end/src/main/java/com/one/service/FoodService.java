package com.one.service;

import com.one.entity.foodModel.Food;

import java.util.List;

public interface FoodService {

    List<Food> getAllFoods(String name);
}
