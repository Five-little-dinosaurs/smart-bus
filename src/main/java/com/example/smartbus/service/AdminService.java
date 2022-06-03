package com.example.smartbus.service;

import com.example.smartbus.dto.AdminDto;
import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.Admin;

import java.util.List;

public interface AdminService {
    AdminDto alogin(Admin admin);

    CommonResult aregister(Admin admin);

    List<Admin> findAll();

    List<Admin> findById(int aid);

    Admin findByAccount(String account);

    CommonResult insert(Admin admin);

    CommonResult update(Admin admin);
}
