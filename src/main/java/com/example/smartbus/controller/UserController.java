package com.example.smartbus.controller;

import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.dto.UserDto;
import com.example.smartbus.entity.Admin;
import com.example.smartbus.entity.User;
import com.example.smartbus.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1/entity/user")
public class UserController {
    @Resource
    UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/userdetail")
    public List<UserDto> findAllDetail() {
        return userService.findAllDetail();
    }

    @GetMapping("/{id}")
    public List<User> findById(@PathVariable("id") int id) {
        return userService.findById(id);
    }

    @GetMapping("/findByAccount/{account}")
    public User findByAccount(@PathVariable("account") String account) {
        return userService.findByAccount(account);
    }

    @GetMapping("/findByName/{name}")
    public User findByName(@PathVariable("name") String name) {
        return userService.findByName(name);
    }

}
