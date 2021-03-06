package com.example.smartbus.service.Impl;

import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.Driver;
import com.example.smartbus.mapper.DriverMapper;
import com.example.smartbus.service.DriverService;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Resource
    DriverMapper driverMapper;

    @Override
    public List<Driver> findAll() {
        return driverMapper.findAll();
    }

    @Override
    public List<Driver> findById(int id) {
        return driverMapper.findById(id);
    }

    @Override
    public CommonResult deleteById(int id) {
        CommonResult commonResult = new CommonResult();
        try {
            int res = driverMapper.deleteById(id);
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
    public CommonResult updateByBusNum(Driver driver) {
        CommonResult commonResult = new CommonResult();
        try {
            int res = driverMapper.updateByBusNum(driver);
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
    public CommonResult insert(Driver driver) {
        CommonResult commonResult = new CommonResult();
        try {
            int res = driverMapper.insert(driver);
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
    public CommonResult update(Driver driver) {
        CommonResult commonResult = new CommonResult();
        try {
            int res = driverMapper.update(driver);
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
}
