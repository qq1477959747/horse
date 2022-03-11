package com.dsjjsyyy.horse.controller;

import com.dsjjsyyy.horse.model.HouseInfo;
import com.dsjjsyyy.horse.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 罗日程
 * @Description
 * @create 2022/3/11
 */
@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @RequestMapping("/info/all")
    public List<HouseInfo> getHouseInfos() {
        return houseService.getHouseInfo();
    }

}
