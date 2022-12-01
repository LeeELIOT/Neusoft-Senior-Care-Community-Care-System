package com.one.service;

import com.one.entity.estimateModel.Estimate;

import java.util.List;

public interface EstimateService {

    /*通过档案号或者名字查找*/
    List<Estimate> getAllEstimates(String idOrName);
}
