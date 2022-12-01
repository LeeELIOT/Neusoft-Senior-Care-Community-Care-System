package com.one.dao.priceModel;

import com.one.entity.priceModel.Price;

import java.util.List;

public interface PriceDao {

    /*得到所有的价格信息*/
    List<Price> getAllPrices(Integer id);


}
