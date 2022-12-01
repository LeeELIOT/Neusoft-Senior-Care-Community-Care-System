package com.one.service;

import com.one.entity.healthyModel.Healthy;

import java.util.List;

public interface HealthyService {

    /*通过档案号查找健康档案信息*/
    List<Healthy> getAllHealthy(Integer id);
}
