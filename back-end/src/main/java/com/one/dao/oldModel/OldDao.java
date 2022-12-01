package com.one.dao.oldModel;

import com.one.entity.oldModel.Old;

import java.util.List;

public interface OldDao {

    /*得到所有的老人信息*/
    List<Old> getAllOlds(String name);


}
