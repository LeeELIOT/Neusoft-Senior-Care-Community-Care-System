package com.one.dao.commentModel;

import com.one.entity.commentModel.Module;

import java.util.List;

public interface ModuleDao {

    /*得到所有的模块信息*/
    List<Module> getAllModules(String name);


}
