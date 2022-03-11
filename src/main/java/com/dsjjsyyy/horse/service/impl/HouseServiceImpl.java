package com.dsjjsyyy.horse.service.impl;

import com.dsjjsyyy.horse.dao.HouseDao;
import com.dsjjsyyy.horse.model.HouseInfo;
import com.dsjjsyyy.horse.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 罗日程
 * @Description
 * @create 2022/3/11
 */
@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseDao houseDao;

    @Override
    public List<HouseInfo> getHouseInfo() {
        return houseDao.selectList(null);
    }
}
