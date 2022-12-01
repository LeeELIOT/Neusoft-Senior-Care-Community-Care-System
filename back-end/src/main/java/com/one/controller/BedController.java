package com.one.controller;

import com.one.entity.bedModel.Bed;
import com.one.service.impl.BedServiceImpl;
import com.one.service.impl.BlockServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("bed")
@Slf4j
@CrossOrigin
public class BedController {

    @Autowired
    private BedServiceImpl bedService;

    @Autowired
    private BlockServiceImpl blockService;


    /**
     * 查找所有符合查找条件的床位
     * @param blockName 大楼名字
     * @param floor 层数
     * @return 空闲、预留、已占床位数量，返回某楼某楼层的床位信息
     */
    @PostMapping("getAllBeds")
    private Map<String,Object> getAllBeds(@RequestParam(value = "blockName") String blockName,
                                          @RequestParam(value = "floor") Integer floor){
        log.info("old/bed/getAllBeds请求参数为[{}],[{}]",blockName,floor);
        Map<String,Object> map = new HashMap<>();
        List<Bed> allBeds = bedService.getAllBeds(blockName,floor);
        Map<String, Map<String,Object>> bedByRoom = new HashMap<>();
        log.info("{}",allBeds);
        int bedSum = 0;
        for (Bed allBed : allBeds) {
            //房间名
            String roomName = allBed.getRoom().getName();
            //床名
            Integer bedName = allBed.getName();
            String bedStatus = allBed.getBedStatus();
            if (!bedByRoom.containsKey(roomName)) {
                Map<String, Object> sMap = new HashMap<>();
                sMap.put(String.valueOf(bedName), bedStatus);
                bedByRoom.put(roomName, sMap);
            } else {
                bedByRoom.get(roomName).put(String.valueOf(bedName), bedStatus);
            }
        }
        log.info("bedByRoom信息为[{}]",bedByRoom);
        int maxFloor = blockService.getMaxFloor(blockName);
        int freeBed = bedService.getFreeBed(blockName, floor);
        int reserveBed = bedService.getReserveBed(blockName, floor);
        int occupyBed = bedService.getOccupyBed(blockName, floor);
        int sumBed = freeBed+reserveBed+occupyBed;
        if(ObjectUtils.isEmpty(allBeds)){
            map.put("status",false);
            //map.put("allBeds","");
            map.put("freeBed","");
            map.put("reserveBed","");
            map.put("occupyBed","");
            map.put("sumBed","");
            map.put("maxFloor","");
            map.put("bedByRoom","");
        }else{
            map.put("status",true);
            //map.put("allBeds",allBeds);
            map.put("freeBed",freeBed);
            map.put("reserveBed",reserveBed);
            map.put("occupyBed",occupyBed);
            map.put("sumBed",sumBed);
            map.put("maxFloor",maxFloor);
            map.put("bedByRoom",bedByRoom);
        }
        log.info("old/bed/getAllBeds返回信息为[{}]",map);
        return map;
    }
}
