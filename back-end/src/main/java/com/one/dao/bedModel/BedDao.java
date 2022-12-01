package com.one.dao.bedModel;


import com.one.entity.bedModel.Bed;

import java.util.List;

public interface BedDao {
    /*得到所有的床位信息*/
    List<Bed> getAllBeds(String blockName,Integer floor);

    /*找到空闲的床数*/
    int getFreeBed(String blockName,Integer floor);

    /*找到预留的床数*/
    int getReserveBed(String blockName,Integer floor);

    /*找到占用的床数*/
    int getOccupyBed(String blockName,Integer floor);

    /*根据老人的名字获取床位信息*/
    Bed getBedByUsername();


}
