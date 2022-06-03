package com.example.smartbus.controller;

import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.BusRoute;
import com.example.smartbus.service.BusRouteService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1/entity/busroute")
public class BusRouteController {
    @Resource
    BusRouteService busRouteService;

    @GetMapping
    public List<BusRoute> findAll() {
        return busRouteService.findAll();
    }

    @GetMapping("/{id}")
    public List<BusRoute> findById(@PathVariable("id") String id) {
        return busRouteService.findById(id);
    }


    @DeleteMapping("/{id}")
    public CommonResult deleteById(@PathVariable("id") String id) {
        return busRouteService.deleteById(id);
    }

    @PostMapping
    public CommonResult insert(@RequestBody BusRoute busRoute) {
        return busRouteService.insert(busRoute);
    }

    @PutMapping
    public CommonResult update(@RequestBody BusRoute busRoute) {
        return busRouteService.update(busRoute);
    }
}
