package com.hfwas.demo.dao.impl;

import com.hfwas.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @A hfwas
 * @Date: 2:21 上午
 * @Version: 1.0
 **/
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private RestTemplate restTemplate;



}
