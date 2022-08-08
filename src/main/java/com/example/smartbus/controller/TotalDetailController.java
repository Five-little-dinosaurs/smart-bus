package com.example.smartbus.controller;

import com.example.smartbus.entity.TotalDetail;
import com.example.smartbus.service.TotalDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1/entity/totaldetail")
public class TotalDetailController {
    @Resource
    TotalDetailService totalDetailService;

    @GetMapping
    public TotalDetail find() {
        return totalDetailService.find();
    }


}
