package com.example.smartbus.service;

import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.BusRoute;

import java.util.List;

public interface BusRouteService {

    List<BusRoute> findAll();

    List<BusRoute> findById(int busrouteid);

    CommonResult deleteById(int busrouteid);

    CommonResult insert(BusRoute busRoute);

    CommonResult update(BusRoute busRoute);

    List<BusRoute> findByNumber(String number);
}
