package com.one.dao.healthyModel;

import com.one.entity.healthyModel.Healthy;
import java.util.List;

public interface HealthyDao {

    /*通过档案号查找健康档案信息*/
    List<Healthy> getAllHealthy(Integer id);
}
