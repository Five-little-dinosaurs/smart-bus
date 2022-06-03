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
    public List<Driver> findById(String id) {
        return driverMapper.findById(id);
    }

    @Override
    public CommonResult deleteById(String id) {
        return null;
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
        return null;
    }
}
