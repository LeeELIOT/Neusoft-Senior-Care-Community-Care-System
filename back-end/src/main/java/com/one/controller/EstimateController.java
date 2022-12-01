package com.one.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.entity.estimateModel.Estimate;
import com.one.entity.estimateModel.Template;
import com.one.service.impl.EstimateServiceImpl;
import com.one.service.impl.TemplateServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("estimate")
@Slf4j
@CrossOrigin
public class EstimateController {

    @Autowired
    private EstimateServiceImpl estimateService;

    @Autowired
    private TemplateServiceImpl templateService;

    /**
     * 得到所有的评估日志信息
     *
     * @param pn       页数
     * @param idOrName 档案号或名字
     * @return map集合
     */
    @PostMapping("getAllEstimates")
    private Map<String, Object> getAllEstimates(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                                @RequestParam(value = "idOrName", required = false) String idOrName) {
        if (idOrName == null) {
            idOrName = "%%";
        }else if (!idOrName.matches("[0-9]*")) {
            idOrName = "%" + idOrName + "%";
        }
        log.info("old/estimate/getAllEstimates请求参数为[{}],[{}]", pn, idOrName);
        Map<String, Object> map = new HashMap<>();
        List<Estimate> allEstimates = estimateService.getAllEstimates(idOrName);
        if (ObjectUtils.isEmpty(allEstimates)) {
            map.put("status", false);
            map.put("allEstimates", "");
        } else {
            map.put("status", true);
            map.put("allEstimates", allEstimates);
        }
        return map;

    }


    /**
     * 得到所有评估模板
     *
     * @param pn   分页
     * @param name 通过模板名字查找所有模板
     * @return map集合
     */
    @PostMapping("getAllTemplates")
    private Map<String, Object> getAllTemplates(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                                @RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            name = "%%";
        } else {
            name = "%" + name + "%";
        }
        PageHelper.startPage(pn, 10);
        log.info("old/estimate/getAllTemplates请求参数为[{}],[{}]", pn, name);
        Map<String, Object> map = new HashMap<>();
        List<Template> allTemplates = templateService.getAllTemplates(name);
        PageInfo<Template> pageInfo = new PageInfo<>(allTemplates, 5);
        if (ObjectUtils.isEmpty(pageInfo)) {
            map.put("status", false);
            map.put("pageInfo", "");
        } else {
            map.put("status", true);
            map.put("pageInfo", pageInfo);
        }
        log.info("old/estimate/getAllTemplates返回信息为[{}]", map);
        return map;
    }
}
