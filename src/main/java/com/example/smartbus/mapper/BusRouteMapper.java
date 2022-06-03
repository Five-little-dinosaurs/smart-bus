package com.example.smartbus.mapper;

import com.example.smartbus.entity.BusRoute;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface BusRouteMapper {

    List<BusRoute> findAll();

    List<BusRoute> findById(int busrouteid);

    int insert(BusRoute admin) throws DataAccessException;

    int deleteById(int busrouteid);

    int update(BusRoute admin) throws DataAccessException;

    List<BusRoute> findByNumber(String number);
}
