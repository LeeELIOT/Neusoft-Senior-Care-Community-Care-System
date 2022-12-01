package com.one.service;

import com.one.entity.commentModel.Module;
import com.one.entity.commentModel.OldComment;

import java.util.List;

public interface ModuleService {

    /*得到所有的模块信息*/
    List<Module> getAllModules(String name);

    /*得到所有的评估信息*/
    List<OldComment> getAllOldComments(String name);
}
