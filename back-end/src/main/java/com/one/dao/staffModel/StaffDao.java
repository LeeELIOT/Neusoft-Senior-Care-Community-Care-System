package com.one.dao.staffModel;

import com.one.entity.staffModel.Job;
import com.one.entity.staffModel.Staff;

import java.util.List;

public interface StaffDao {

    /**
     * 查找所有职工信息
     * @param staffTypeName 职工类型名
     * @param name 职工名字
    */
    List<Staff> getAllStaffs(String staffTypeName,String name);

    /**
     * 通过职工号查找职工的具体工作信息
     * @param StaffId 职工号
     */
    Job getJob(Integer StaffId);
}
