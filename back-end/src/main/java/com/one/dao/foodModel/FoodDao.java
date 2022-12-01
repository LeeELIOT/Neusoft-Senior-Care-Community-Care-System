package com.one.dao.foodModel;

import com.one.entity.foodModel.Food;

import java.util.List;

public interface FoodDao {

    List<Food> getAllFoods(String name);
}
