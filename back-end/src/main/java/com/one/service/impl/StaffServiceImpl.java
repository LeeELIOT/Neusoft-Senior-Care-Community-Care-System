package com.one.service.impl;

import com.one.dao.staffModel.StaffDao;
import com.one.entity.staffModel.Job;
import com.one.entity.staffModel.Staff;
import com.one.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffDao staffDao;

    @Override
    public List<Staff> getAllStaffs(String staffTypeName, String name) {
        return staffDao.getAllStaffs(staffTypeName,name);
    }

    @Override
    public Job getJob(Integer StaffId) {
        return staffDao.getJob(StaffId);
    }
}
