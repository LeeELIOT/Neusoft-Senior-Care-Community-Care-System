package com.one.service.impl;

import com.one.dao.healthyModel.HealthyDao;
import com.one.entity.healthyModel.Healthy;
import com.one.service.HealthyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthyServiceImpl implements HealthyService {

    @Autowired
    private HealthyDao healthyDao;

    @Override
    public List<Healthy> getAllHealthy(Integer id) {
        return healthyDao.getAllHealthy(id);
    }
}
