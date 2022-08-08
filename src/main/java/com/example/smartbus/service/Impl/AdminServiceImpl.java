package com.example.smartbus.service.Impl;

import com.example.smartbus.dto.AdminDto;
import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.Admin;
import com.example.smartbus.mapper.AdminMapper;
import com.example.smartbus.service.AdminService;
import com.example.smartbus.utils.JwtUtils;
import com.example.smartbus.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    RedisUtils redisUtils;
    @Resource
    AdminMapper adminMapper;

    @Override
    public AdminDto alogin(Admin admin) {

        AdminDto adminDto = new AdminDto();
        Admin admin_back;
        String token = "";
        // 从数据库根据唯一的账号account搜索，返回客户类customer_back
        admin_back = adminMapper.findAdminByAccount(admin.getAccount());
        // 如果返回的客户类为空或者密码不匹配，返回空串token。 
        if (admin_back == null || !Objects.equals(admin_back.getPassword(), admin.getPassword())) {
            adminDto.setToken(token);
            return adminDto;
        }

        // 获取传进来的账号account，生成token，将{account:token}存入redis
        String account = admin.getAccount();
        token = JwtUtils.getJwtToken(account);
        System.out.println(token);
        redisUtils.set(account, token);
        // 返回给用户,将返回密码设置成空串
        admin_back.setPassword("");
        adminDto.setAdmin(admin_back);
        adminDto.setToken(token);

        return adminDto;
    }

    @Override
    public CommonResult aregister(Admin admin) {

        CommonResult commonResult = new CommonResult();
        Admin admin_back;
        admin_back = adminMapper.findAdminByAccount(admin.getAccount());
        // 判断是否已被注册
        if (admin_back != null) {
            commonResult.setStatus("Failed");
            commonResult.setMsg("user already exists");
            return commonResult;
        }
        // 生成uuid，进行注册
        int res = adminMapper.insert(admin);
        // 判断后台操作成功条数，为1即正常，为0则失败。
        if (res == 0) {
            commonResult.setStatus("Failed");
            commonResult.setMsg("backend insert failed");
            return commonResult;
        } else {
            commonResult.setStatus("OK");
            commonResult.setMsg("");
            return commonResult;
        }
    }

    @Override
    public List<Admin> findAll() {
        return adminMapper.findAll();
    }

    @Override
    public List<Admin> findById(int aid) {
        return adminMapper.findById(aid);
    }

    @Override
    public Admin findByAccount(String account) {
        return adminMapper.findAdminByAccount(account);
    }

    @Override
    public CommonResult insert(Admin admin) {
        CommonResult commonResult = new CommonResult();
        try {
            int res = adminMapper.insert(admin);
            if (res == 1) {
                commonResult.setStatus("OK");
            } else {
                commonResult.setStatus("Failed");
            }
            return commonResult;
        } catch (DataAccessException e) {
            commonResult.setStatus("Failed");
            commonResult.setMsg(e.toString());
            return commonResult;
        }

    }

    @Override
    public CommonResult update(Admin admin) {
        CommonResult commonResult = new CommonResult();
        try {
            int res = adminMapper.update(admin);
            if (res == 1) {
                commonResult.setStatus("OK");
            } else {
                commonResult.setStatus("Failed");
            }
            return commonResult;
        } catch (DataAccessException e) {
            commonResult.setStatus("Failed");
            commonResult.setMsg(e.toString());
            return commonResult;
        }

    }
}
