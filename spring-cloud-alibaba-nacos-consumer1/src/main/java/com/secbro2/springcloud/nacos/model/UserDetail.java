package com.secbro2.springcloud.nacos.model;

/**
 * @author sec
 * @version 1.0
 * @date 2021/5/21
 **/
public class UserDetail {

    private Integer userId;

    private String username;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
