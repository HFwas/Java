package com.hfwas.demo.controller;

import com.hfwas.demo.domain.User;
import com.hfwas.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName AuthController
 * @Description TODO
 * @A hfwas
 * @Date: 2:12 上午
 * @Version: 1.0
 **/
@RestController
public class AuthController {
        @Autowired
        UserService userService;
        /**
         * 用户登录
         * @param loginForm
         */
        @PostMapping("/login")
        public ResponseEntity<RestResult> login(@RequestBody Map<String, String> loginForm) throws BusiException {
            // 1. 获取登录表单
            String userName = loginForm.get("username");
            String plaintextPassword = loginForm.get("password");
            // 2. 获取用户
            User user = null;
            if (userName.contains("@")) {
                //user = userService.getByEmail(userName);
            } else {
                //user = userService.getByUserName(userName);
            }
            if (user==null) {
                //throw new BusiException("账号或密码错误");
            }
            // 3. 检查密码
            boolean checkPassword = PasswordHelper.validate(user.getPassword(), plaintextPassword, user.getSalt());
            if (!checkPassword) {
                throw new BusiException("账号或密码错误");
            }
            // 4. 生成Token，拿到Token设置在响应Headers里返回
            String token = userService.createWebToken(user);
            HttpHeaders headers = new HttpHeaders();
            headers.set("Set-Token", token);
            RestResult result = RestResult.succ("登录成功", userService.getById(user.getId()));
            ResponseEntity<RestResult> resp = new ResponseEntity<>(result, headers, HttpStatus.OK);
            return resp;
        }

}
