package com.example.smartbus.controller;

import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.BusDetail;
import com.example.smartbus.service.BusDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1/entity/busdetail")
public class BusDetailController {
    @Resource
    BusDetailService busDetailService;

    @GetMapping
    public List<BusDetail> findAll() {
        return busDetailService.findAll();
    }

    @GetMapping("/{id}")
    public List<BusDetail> findById(@PathVariable("id") String id) {
        return busDetailService.findById(id);
    }

    @DeleteMapping("/{id}")
    public CommonResult deleteById(@PathVariable("id") String id) {
        return busDetailService.deleteById(id);
    }

    @PostMapping
    public CommonResult insert(@RequestBody BusDetail busDetail) {
        return busDetailService.insert(busDetail);
    }

    @PutMapping
    public CommonResult update(@RequestBody BusDetail busDetail) {
        return busDetailService.update(busDetail);
    }
}
