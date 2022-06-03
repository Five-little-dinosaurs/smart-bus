package com.example.smartbus.service.Impl;

import com.example.smartbus.dto.BusRouteDto;
import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.BusRoute;
import com.example.smartbus.mapper.BusRouteMapper;
import com.example.smartbus.mapper.DriverMapper;
import com.example.smartbus.service.BusRouteService;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BusRouteServiceImpl implements BusRouteService {

    @Resource
    BusRouteMapper busRouteMapper;
    @Resource
    DriverMapper driverMapper;
    @Override
    public List<BusRouteDto> findAll() {
        List<BusRouteDto> busRouteDtos = busRouteMapper.findAll();
        for (BusRouteDto b: busRouteDtos
             ) {
            if (driverMapper.findById(b.getDriverId()).size()!=0) {
                b.setDriverName(driverMapper.findById(b.getDriverId()).get(0).getName());
            }
        }
        return busRouteDtos;
    }

    @Override
    public List<BusRoute> findById(int busrouteid) {
        return busRouteMapper.findById(busrouteid);
    }

    @Override
    public CommonResult deleteById(int busrouteid) {
        CommonResult commonResult = new CommonResult();
        try {
            int res = busRouteMapper.deleteById(busrouteid);
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
        CommonResult commonResult = new CommonResult();
        try {
            int res = busRouteMapper.update(busRoute);
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
    public List<BusRoute> findByNumber(String number) {
        return busRouteMapper.findByNumber(number);
    }
}
