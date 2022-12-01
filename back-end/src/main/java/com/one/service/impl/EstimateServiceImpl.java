package com.one.service.impl;

import com.one.dao.estimateModel.EstimateDao;
import com.one.entity.estimateModel.Estimate;
import com.one.service.EstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstimateServiceImpl implements EstimateService {

    @Autowired
    private EstimateDao estimateDao;

    @Override
    public List<Estimate> getAllEstimates(String idOrName) {
        return estimateDao.getAllEstimates(idOrName);
    }
}
