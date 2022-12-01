package com.one.dao.hospitalModel;

import com.one.entity.hospitalModel.ToHospital;
import com.one.entity.oldModel.Old;

import java.util.List;

public interface HospitalDao {

    /*得到所有的就医信息*/
    List<ToHospital> getAllHospitals(String name);


}
