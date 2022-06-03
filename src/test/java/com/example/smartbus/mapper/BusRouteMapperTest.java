package com.example.smartbus.mapper;

import com.example.smartbus.dto.BusRouteDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BusRouteMapperTest {
    @Resource
    BusRouteMapper busRouteMapper;
    @Test
    void findAll() {
        List<BusRouteDto> busRouteDto = busRouteMapper.findAll();
        for (BusRouteDto i: busRouteDto
             ) {
            System.out.println(i.getDriverName());

        }
    }
}