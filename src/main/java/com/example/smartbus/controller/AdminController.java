package com.example.smartbus.controller;

import com.example.smartbus.dto.AdminDto;
import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.Admin;
import com.example.smartbus.service.AdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1/entity/admin")
public class AdminController {
    @Resource
    AdminService adminService;

    @GetMapping
    public List<Admin> findAll() {
        return adminService.findAll();
    }

    @GetMapping("/{aid}")
    public List<Admin> findById(@PathVariable("aid") String aid) {
        return adminService.findById(aid);
    }

    @GetMapping("/findByAccount/{account}")
    public Admin findByAccount(@PathVariable("account") String account) {
        return adminService.findByAccount(account);
    }

    @PostMapping("/alogin")
    public AdminDto alogin(@RequestBody Admin admin) {
        return adminService.alogin(admin);
    }

    @PostMapping
    public CommonResult insert(@RequestBody Admin admin) {
        return adminService.insert(admin);
    }

    @PutMapping
    public CommonResult update(@RequestBody Admin admin) {
        return adminService.update(admin);
    }
}
