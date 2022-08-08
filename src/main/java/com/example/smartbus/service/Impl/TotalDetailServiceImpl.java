package com.example.smartbus.service.Impl;

import com.example.smartbus.entity.TotalDetail;
import com.example.smartbus.mapper.TotalDetailMapper;
import com.example.smartbus.service.TotalDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TotalDetailServiceImpl implements TotalDetailService {

    @Resource
    TotalDetailMapper totalDetailMapper;
    @Override
    public TotalDetail find() {
        return totalDetailMapper.find();
    }
}
