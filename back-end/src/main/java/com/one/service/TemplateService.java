package com.one.service;

import com.one.entity.estimateModel.Estimate;
import com.one.entity.estimateModel.Template;

import java.util.List;
public interface TemplateService {

    /*通过名字查找*/
    List<Template> getAllTemplates(String name);
}
