package com.hfwas.demo.service.impl;

import com.hfwas.demo.dao.UserDao;
import com.hfwas.demo.service.UserService;
import com.hfwas.demo.util.WebTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @A hfwas
 * @Date: 2:15 上午
 * @Version: 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User getById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }
    @Override
    public User getByUserName(String userName) {
        return userDao.selectByUserName(userName);
    }
    @Override
    public User getByEmail(String email) {
        return userDao.selectByEmail(email);
    }
    //创建Token，这里要根据当前时间获取密钥，并且生成Token,更新用户的最后登入时间
    @Transactional
    @Override
    public String createWebToken(User user) {
        Instant now = Instant.now();
        String secretKey = WebTokenUtil.genSecretKey(now);
        String token = WebTokenUtil.create(secretKey, user.getId().toString(), now, 5);
        user.setLastLogin(LocalDateTime.ofInstant(now, ZoneId.systemDefault()));
        userDao.updateByPrimaryKey(user);
        return token;
    }
}
