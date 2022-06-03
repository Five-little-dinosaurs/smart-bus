package com.example.smartbus.service;

import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.BusRoute;
import java.util.List;

public interface BusRouteService {

    List<BusRoute> findAll();

    List<BusRoute> findById(String busrouteid);

    CommonResult deleteById(String busrouteid);

    CommonResult insert(BusRoute busRoute);

    CommonResult update(BusRoute busRoute);
}
