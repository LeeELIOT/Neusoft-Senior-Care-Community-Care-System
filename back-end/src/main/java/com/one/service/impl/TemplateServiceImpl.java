package com.one.service.impl;

import com.one.dao.estimateModel.TemplateDao;
import com.one.entity.estimateModel.Estimate;
import com.one.entity.estimateModel.Template;
import com.one.service.TemplateService;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateServiceImpl implements TemplateService {

    @Autowired
    private TemplateDao templateDao;


    @Override
    public List<Template> getAllTemplates(String name) {
        return templateDao.getAllTemplates(name);
    }
}
