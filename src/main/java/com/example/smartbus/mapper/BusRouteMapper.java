package com.example.smartbus.mapper;

import com.example.smartbus.dto.BusRouteDto;
import com.example.smartbus.entity.BusRoute;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface BusRouteMapper {

    List<BusRouteDto> findAll();

    List<BusRoute> findById(int id);

    int insert(BusRoute busRoute) throws DataAccessException;

    int deleteById(int id);

    int update(BusRoute admin) throws DataAccessException;

    List<BusRoute> findByNumber(String number);
}
