package com.hfwas.demo.service;

/**
 * @ClassName UserService
 * @Description TODO
 * @A hfwas
 * @Date: 2:14 上午
 * @Version: 1.0
 **/
public interface UserService {
    User getById(Integer id);
    User getByUserName(String userName);
    User getByEmail(String email);
    String createWebToken(User user);
}
