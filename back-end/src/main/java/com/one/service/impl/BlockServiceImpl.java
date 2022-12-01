package com.one.service.impl;

import com.one.dao.bedModel.BlockDao;
import com.one.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlockServiceImpl implements BlockService {

    @Autowired
    private BlockDao blockDao;

    @Override
    public int getMaxFloor(String name) {
        return blockDao.getMaxFloor(name);
    }
}
