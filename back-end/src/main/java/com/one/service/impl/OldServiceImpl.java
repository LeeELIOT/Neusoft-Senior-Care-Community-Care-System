package com.one.service.impl;

import com.one.dao.oldModel.OldDao;
import com.one.entity.oldModel.Old;
import com.one.service.OldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OldServiceImpl implements OldService {

    @Autowired
    private OldDao oldDao;

    @Override
    public List<Old> getAllOlds(String name) {
        return oldDao.getAllOlds(name);
    }
}
