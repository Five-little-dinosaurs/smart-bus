package com.example.smartbus.service;

import com.example.smartbus.dto.BusRouteDto;
import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.BusRoute;

import java.util.List;

public interface BusRouteService {

    List<BusRouteDto> findAll();

    List<BusRoute> findById(int id);

    CommonResult deleteById(int id);


    CommonResult insert(BusRoute busRoute);

    CommonResult update(BusRoute busRoute);

    List<BusRoute> findByNumber(String number);
}
