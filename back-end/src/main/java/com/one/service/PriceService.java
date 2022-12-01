package com.one.service;

import com.one.entity.priceModel.Price;
import com.one.entity.staffModel.Job;
import com.one.entity.staffModel.Staff;

import java.util.List;

public interface PriceService {

    /*得到所有的老人信息*/
    List<Price> getAllPrices(Integer id);
}
