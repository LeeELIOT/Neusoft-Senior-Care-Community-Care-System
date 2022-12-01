package com.one.service;

import com.one.entity.oldModel.Old;

import java.util.List;

public interface OldService {

    /*得到所有的老人信息*/
    List<Old> getAllOlds(String name);
}
