package com.secbro2.springcloud.nacos.controller;

import com.secbro2.springcloud.nacos.model.UserDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sec
 * @version 1.0
 * @date 2021/5/21
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/getUserById")
    public UserDetail getUserById(Integer userId) {
        logger.info("查询用户信息，userId={}", userId);
        UserDetail detail = new UserDetail();
        detail.setUserId(1);
        detail.setUsername("Tom");
        return detail;
    }
}
