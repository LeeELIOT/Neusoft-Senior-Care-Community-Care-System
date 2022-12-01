package com.one.dao.estimateModel;

import com.one.entity.estimateModel.Estimate;

import java.util.List;

public interface EstimateDao {

    /*通过档案号或者名字查找*/
    List<Estimate> getAllEstimates(String idOrName);
}
