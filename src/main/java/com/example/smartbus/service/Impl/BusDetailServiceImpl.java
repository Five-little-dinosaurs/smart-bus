package com.example.smartbus.service.Impl;

import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.BusDetail;
import com.example.smartbus.mapper.BusDetailMapper;
import com.example.smartbus.mapper.BusRouteMapper;
import com.example.smartbus.service.BusDetailService;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BusDetailServiceImpl implements BusDetailService {

    @Resource
    BusDetailMapper busDetailMapper;

    @Override
    public List<BusDetail> findAll() {
        return busDetailMapper.findAll();
    }

    @Override
    public List<BusDetail> findById(String number) {
        return busDetailMapper.findById(number);
    }

    @Override
    public CommonResult deleteById(String number) {
        CommonResult commonResult = new CommonResult();
        try {
            int res = busDetailMapper.deleteById(number);
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
    public CommonResult insert(BusDetail busDetail) {
        CommonResult commonResult = new CommonResult();
        try {
            int res = busDetailMapper.insert(busDetail);
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
    public CommonResult update(BusDetail busDetail) {
        CommonResult commonResult = new CommonResult();
        try {
            int res = busDetailMapper.update(busDetail);
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
