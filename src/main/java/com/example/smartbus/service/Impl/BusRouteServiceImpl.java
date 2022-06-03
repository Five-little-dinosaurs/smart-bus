package com.example.smartbus.service.Impl;

import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.BusRoute;
import com.example.smartbus.mapper.BusRouteMapper;
import com.example.smartbus.service.BusRouteService;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BusRouteServiceImpl implements BusRouteService {

    @Resource
    BusRouteMapper busRouteMapper;

    @Override
    public List<BusRoute> findAll() {
        return null;
    }

    @Override
    public List<BusRoute> findById(String busrouteid) {
        return null;
    }

    @Override
    public CommonResult deleteById(String busrouteid) {
        return null;
    }

    @Override
    public CommonResult insert(BusRoute busRoute) {
        CommonResult commonResult = new CommonResult();
        try {
            int res = busRouteMapper.insert(busRoute);
            if (res == 1) {
                commonResult.setStatus("OK");
            } else {
                commonResult.setStatus("Failed");
            }
            return commonResult;
        } catch (DataAccessException e) {
            commonResult.setStatus("Failed");
            commonResult.setMsg(e.toString());
            return commonResult;
        }
    }

    @Override
    public CommonResult update(BusRoute busRoute) {
        return null;
    }
}
