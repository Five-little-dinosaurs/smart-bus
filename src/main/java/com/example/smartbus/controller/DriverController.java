package com.example.smartbus.controller;

import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.BusRoute;
import com.example.smartbus.entity.Driver;
import com.example.smartbus.service.BusRouteService;
import com.example.smartbus.service.DriverService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1/entity/driver")
public class DriverController {
    @Resource
    DriverService driverService;

    @GetMapping
    public List<Driver> findAll() {
        return driverService.findAll();
    }

    @GetMapping("/{id}")
    public List<Driver> findById(@PathVariable("id") String id) {
        return driverService.findById(id);
    }


    @DeleteMapping("/{id}")
    public CommonResult deleteById(@PathVariable("id") String id) {
        return driverService.deleteById(id);
    }

    @PostMapping
    public CommonResult insert(@RequestBody Driver driver) {
        return driverService.insert(driver);
    }

    @PutMapping
    public CommonResult update(@RequestBody Driver driver) {
        return driverService.update(driver);
    }
}
