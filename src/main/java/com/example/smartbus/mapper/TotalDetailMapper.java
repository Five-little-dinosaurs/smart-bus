package com.example.smartbus.mapper;

import com.example.smartbus.entity.TotalDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TotalDetailMapper {
    TotalDetail find();
}
