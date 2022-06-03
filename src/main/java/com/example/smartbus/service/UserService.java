package com.example.smartbus.service;

import com.example.smartbus.dto.UserDto;
import com.example.smartbus.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    List<User> findById(int id);

    User findByAccount(String account);

    User findByName(String name);

    List<UserDto> findAllDetail();
}
