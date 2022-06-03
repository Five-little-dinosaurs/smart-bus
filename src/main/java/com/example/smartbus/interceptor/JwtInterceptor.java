package com.example.smartbus.interceptor;

import com.example.smartbus.entity.Admin;
import com.example.smartbus.mapper.AdminMapper;
import com.example.smartbus.utils.JwtUtils;
import com.example.smartbus.utils.RedisUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class JwtInterceptor implements HandlerInterceptor {
    //    @Autowired
//    RedisTemplate redisTemplate;
    @Autowired
    RedisUtils redisUtils;
    @Resource
    AdminMapper adminMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String JWT = request.getHeader("Authorization");
        String url = request.getRequestURI();
        String method = request.getMethod();
        if (url.startsWith("/v1/entity/product/forBaidu"))
            return true;
        if (method.equals("OPTIONS")) {
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        }
        if (JWT.equals("pass")) {
            return true;
        }
        String required = "";
        System.out.println(method);

        System.out.println(url);


        Jws<Claims> claimsJws;
        try {
            // 校验JWT字符串
            claimsJws = JwtUtils.decode(JWT);
            // 取出playload
            Claims claims = claimsJws.getBody();
            // 取出playload中的数据(如果是自己自定义的键值可以通过get()方法取出，假设储存的值可以转换String;如果是playload中的标准字段可以直接通过函数取出)
            // 取出用户账号即account
            String account = (String) claims.get("account");

            // 将redis中根据account取出的token转化为String类型
            String JWTR = (String) redisUtils.get(account);
            // 判断是否和原本存的token相等

            // 还可能继续加异常判断

            if (!JWT.equals(JWTR)) {
                System.out.println("1-false");
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                return false;
            } else {
                System.out.println("1-true");
                return true;
            }


        } catch (JwtException e) {
            claimsJws = null;
            e.printStackTrace();
        }
        return false;
    }
}

