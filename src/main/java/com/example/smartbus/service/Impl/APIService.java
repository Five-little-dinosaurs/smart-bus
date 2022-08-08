package com.example.smartbus.service.Impl;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class APIService {
    public static String getToken() ///获取token
    {
        String url = "https://cn2.naas.huaweicloud.com:18002/controller/v2/tokens";
        RestTemplate restTemplate = new RestTemplate();
        JSONObject json = new JSONObject();
        json.put("userName", "c4_usr_154");
        json.put("password", "1qaz@WSX_154");
        // String res = restTemplate.postForObject(url, json, String.class);
        JSONObject res = restTemplate.postForObject(url,json,JSONObject.class).getJSONObject("data");
        // System.out.println(res);
        // System.out.println(res.getString("token_id"));
        String token=res.getString("token_id");
        return token;
    }
    public static void main(String[] args) {

        String token_id = getToken();
        String url = "https://cn2.naas.huaweicloud.com:18002/controller/campus/v3/sites";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("X-ACCESS-TOKEN",token_id);
        HttpEntity<String> httpEntity = new HttpEntity(requestHeaders);
        System.out.println(httpEntity);
        // 发送GET请求
        ResponseEntity<JSONObject> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, JSONObject.class);
        //JSONObject result = restTemplate.getForObject(url,JSONObject.class);
        System.out.println(responseEntity.getBody());
        JSONObject result = responseEntity.getBody();
        result.getString("date");
        System.out.println();

    }
}






