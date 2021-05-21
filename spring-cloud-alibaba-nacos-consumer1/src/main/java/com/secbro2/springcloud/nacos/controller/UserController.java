package com.secbro2.springcloud.nacos.controller;

import com.secbro2.springcloud.nacos.model.UserDetail;
import com.secbro2.springcloud.nacos.service.UserFeignService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author sec
 * @version 1.0
 * @date 2021/5/21
 **/
@RestController
@RequestMapping("/order")
public class UserController {

    @Resource
    private UserFeignService userFeignService;

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String userProvider;

    @GetMapping("getUserInfo")
    public UserDetail getUserInfo() {
        int userId = 1;
        ResponseEntity<UserDetail> result = restTemplate.getForEntity(userProvider + "/user/getUserById?userId=" + userId, UserDetail.class);
        return result.getBody();
    }

    @GetMapping("getUserInfo1")
    public UserDetail getUserInfoByFeign() {
        return userFeignService.getUserById(2);
    }

}
