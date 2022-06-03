package com.example.smartbus.controller;

import com.example.smartbus.dto.BusRouteDto;
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
    public List<BusRouteDto> findAll() {
        return busRouteService.findAll();
    }

    @GetMapping("/{id}")
    public List<BusRoute> findById(@PathVariable("id") int id) {
        return busRouteService.findById(id);
    }

    @GetMapping("/{number}")
    public List<BusRoute> findByNumber(@PathVariable("number") String number) {
        return busRouteService.findByNumber(number);
    }

    @DeleteMapping("/{id}")
    public CommonResult deleteById(@PathVariable("id") int id) {
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
