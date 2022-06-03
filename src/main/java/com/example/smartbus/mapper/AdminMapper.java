package com.example.smartbus.mapper;

import com.example.smartbus.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface AdminMapper {
    Admin findAdminByAccount(String account);

    List<Admin> findAll();

    List<Admin> findById(int id);

    int insert(Admin admin) throws DataAccessException;

    int update(Admin admin) throws DataAccessException;
}
