package com.one.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.entity.commentModel.Module;
import com.one.entity.commentModel.OldComment;
import com.one.service.impl.ModuleServiceImpl;
import com.one.util.Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("comment")
@Slf4j
@CrossOrigin
public class CommentController {

    @Autowired
    private ModuleServiceImpl moduleService;

    /**
     * 得到符合条件的所有的模块名字
     * @param name 模块名字
     * @return map
     */
    @PostMapping("getAllModules")
    private Map<String,Object> getAllModules(@RequestParam(value = "name",required = false) String name){
        log.info("/old/comment/getAllModules参数为[{}]",name);
        name = Utils.toLike(name);
        Map<String,Object> map = new HashMap<>();
        List<Module> allModules = moduleService.getAllModules(name);
        if(ObjectUtils.isEmpty(allModules)){
            map.put("status",false);
            map.put("allModules","");
        }else{
            map.put("status",false);
            map.put("allModules",allModules);
        }
        log.info("/old/comment/getAllModules结果为[{}]",map);
        return map;
    }

    /**
     * 得到所有老人对颐养中心的评估状态(是否已经评估及发表的看法)
     * @param pn 页数
     * @param name 老人名字
     * @return map
     */
    @PostMapping("getAllOldComments")
    private Map<String,Object> getAllOldComments(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                                 @RequestParam(value = "name",required = false) String name){
        log.info("/old/comment/getAllOldComments参数为[{}]",name);
        name = Utils.toLike(name);
        PageHelper.startPage(pn, 10);
        Map<String,Object> map = new HashMap<>();
        List<OldComment> allOldComments = moduleService.getAllOldComments(name);
        PageInfo<OldComment> pageInfo =new PageInfo<>(allOldComments,5);
        if(ObjectUtils.isEmpty(pageInfo)){
            map.put("status",false);
            map.put("pageInfo","");
        }else{
            map.put("status",false);
            map.put("pageInfo",pageInfo);
        }
        log.info("/old/comment/getAllOldComments结果为[{}]",map);
        return map;
    }

}
