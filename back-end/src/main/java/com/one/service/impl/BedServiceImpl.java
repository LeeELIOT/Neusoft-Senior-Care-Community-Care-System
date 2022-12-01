package com.one.service.impl;

import com.one.dao.bedModel.BedDao;
import com.one.entity.bedModel.Bed;
import com.one.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedServiceImpl implements BedService {

    @Autowired
    private BedDao bedDao;

    @Override
    public List<Bed> getAllBeds(String blockName,Integer floor) {
        return bedDao.getAllBeds(blockName,floor);
    }

    @Override
    public int getFreeBed(String blockName, Integer floor) {
        return bedDao.getFreeBed(blockName,floor);
    }

    @Override
    public int getReserveBed(String blockName, Integer floor) {
        return bedDao.getReserveBed(blockName,floor);
    }

    @Override
    public int getOccupyBed(String blockName, Integer floor) {
        return bedDao.getOccupyBed(blockName,floor);
    }
}
