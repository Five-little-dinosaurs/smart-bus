package com.example.smartbus.mapper;

import com.example.smartbus.entity.BusDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BusDetailMapper {
    List<BusDetail> findAll();

    List<BusDetail> findById(String number);

    int deleteById(String number);

    int insert(BusDetail busDetail);

    int update(BusDetail busDetail);
}
