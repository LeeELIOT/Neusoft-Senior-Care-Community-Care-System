package com.one.service.impl;

import com.one.dao.bedModel.BedDao;
import com.one.dao.priceModel.PriceDao;
import com.one.entity.bedModel.Bed;
import com.one.entity.priceModel.Price;
import com.one.service.BedService;
import com.one.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceDao priceDao;


    @Override
    public List<Price> getAllPrices(Integer id) {
        return priceDao.getAllPrices(id);
    }
}
