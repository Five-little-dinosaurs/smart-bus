package com.example.smartbus.service;

import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.Driver;


import java.util.List;

public interface DriverService {

    List<Driver> findAll();

    List<Driver> findById(String id);

    CommonResult deleteById(String id);

    CommonResult insert(Driver driver);

    CommonResult update(Driver driver);
}
