package com.example.smartbus.mapper;

import com.example.smartbus.dto.UserDto;
import com.example.smartbus.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();

    List<User> findById(int id);

    User findByAccount(String account);

    User findByName(String name);

    List<UserDto> findAllDetail();
}
