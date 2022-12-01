package com.one.service;

import com.one.entity.bedModel.Bed;
import com.one.entity.hospitalModel.ToHospital;

import java.util.List;

public interface HospitalService {

    /*得到所有的就医信息*/
    List<ToHospital> getAllHospitals(String name);
}
