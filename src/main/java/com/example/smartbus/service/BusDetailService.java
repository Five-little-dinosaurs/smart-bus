package com.example.smartbus.service;

import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.BusDetail;

import java.util.List;

public interface BusDetailService {
    List<BusDetail> findAll();

    List<BusDetail> findById(String id);

    CommonResult deleteById(String id);

    CommonResult insert(BusDetail busDetail);

    CommonResult update(BusDetail busDetail);
}
