package com.one.service.impl;

import com.one.dao.bedModel.BedDao;
import com.one.dao.typeModel.TypeDao;
import com.one.entity.bedModel.Bed;
import com.one.entity.oldModel.OldType;
import com.one.entity.priceModel.PriceType;
import com.one.entity.staffModel.StaffType;
import com.one.service.BedService;
import com.one.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeDao typeDao;


    @Override
    public List<OldType> getAllOldTypes(String name) {
        return typeDao.getAllOldTypes(name);
    }

    @Override
    public List<PriceType> getAllPriceTypes(String name) {
        return typeDao.getAllPriceTypes(name);
    }

    @Override
    public List<StaffType> getAllStaffTypes(String name) {
        return typeDao.getAllStaffTypes(name);
    }
}
