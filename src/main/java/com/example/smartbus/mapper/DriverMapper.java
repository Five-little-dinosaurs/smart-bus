package com.example.smartbus.mapper;

import com.example.smartbus.entity.BusRoute;
import com.example.smartbus.entity.Driver;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface DriverMapper {

    List<Driver> findAll();

    List<Driver> findById(int id);

    int insert(Driver admin) throws DataAccessException;

    int deleteById(int id);

    int update(Driver admin) throws DataAccessException;
}
