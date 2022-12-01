package com.one.service.impl;

import com.one.dao.commentModel.ModuleDao;
import com.one.dao.commentModel.OldCommentDao;
import com.one.entity.commentModel.Module;
import com.one.entity.commentModel.OldComment;
import com.one.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private ModuleDao moduleDao;

    @Autowired
    private OldCommentDao oldCommentDao;

    /*得到所有的模块信息*/
    public List<Module> getAllModules(String name){
        return moduleDao.getAllModules(name);
    }


    @Override
    public List<OldComment> getAllOldComments(String name) {
        return oldCommentDao.getAllOldComments(name);
    }


}
