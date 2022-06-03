package com.example.smartbus.service.Impl;

import com.example.smartbus.dto.UserDto;
import com.example.smartbus.entity.User;
import com.example.smartbus.mapper.AdminMapper;
import com.example.smartbus.mapper.UserMapper;
import com.example.smartbus.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public List<User> findById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByAccount(String account) {
        return userMapper.findByAccount(account);
    }

    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public List<UserDto> findAllDetail() {
        return userMapper.findAllDetail();
    }
}
