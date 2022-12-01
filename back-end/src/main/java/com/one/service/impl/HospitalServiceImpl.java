package com.one.service.impl;

import com.one.dao.bedModel.BedDao;
import com.one.dao.hospitalModel.HospitalDao;
import com.one.entity.bedModel.Bed;
import com.one.entity.hospitalModel.ToHospital;
import com.one.service.BedService;
import com.one.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalDao hospitalDao;

    @Override
    public List<ToHospital> getAllHospitals(String name) {
        return hospitalDao.getAllHospitals(name);
    }
}
