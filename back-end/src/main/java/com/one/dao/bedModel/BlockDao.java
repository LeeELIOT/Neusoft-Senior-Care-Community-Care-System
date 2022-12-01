package com.one.dao.bedModel;

public interface BlockDao {

    /*通过大楼名字得到最大层数*/
    int getMaxFloor(String name);
}

