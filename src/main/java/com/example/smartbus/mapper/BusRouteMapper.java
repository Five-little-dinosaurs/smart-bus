package com.example.smartbus.mapper;

import com.example.smartbus.entity.BusRoute;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface BusRouteMapper {

    List<BusRoute> findAll();

    List<BusRoute> findById(String busrouteid);

    int insert(BusRoute admin) throws DataAccessException;

    int deleteById(String busrouteid);

    int update(BusRoute admin) throws DataAccessException;
}
