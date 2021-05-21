package com.secbro2.springcloud.nacos.service;

import com.secbro2.springcloud.nacos.model.UserDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author sec
 * @version 1.0
 * @date 2021/5/21
 **/
@FeignClient(name = "user-service-provider")
public interface UserFeignService {

    /**
     * 基于Feign的接口调用
     *
     * @param userId 用户ID
     * @return UserDetail
     */
    @GetMapping(value = "/user/getUserById")
    UserDetail getUserById(@RequestParam Integer userId);
}
