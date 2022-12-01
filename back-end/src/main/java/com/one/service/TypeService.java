package com.one.service;

import com.one.entity.bedModel.Bed;
import com.one.entity.oldModel.OldType;
import com.one.entity.priceModel.PriceType;
import com.one.entity.staffModel.StaffType;

import java.util.List;

public interface TypeService {

    /*得到所有的老人类型信息*/
    List<OldType> getAllOldTypes(String name);

    /*得到所有的价钱类型信息*/
    List<PriceType> getAllPriceTypes(String name);

    /*得到所有的职工类型信息*/
    List<StaffType> getAllStaffTypes(String name);
}
