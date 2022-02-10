package com.hfwas.demo.util;

import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.hfwas.demo.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @ClassName UserSecurityUtil
 * @Description TODO
 * @A hfwas
 * @Date: 2:18 上午
 * @Version: 1.0
 **/
@Service
public class UserSecurityUtil {
    private static final Logger logger = LoggerFactory.getLogger(UserSecurityUtil.class);
    @Autowired
    UserDao userDao;
    /**
     * 验证请求中的token
     * @return
     */
    public boolean verifyWebToken(HttpServletRequest req, HttpServletResponse resp) {
        String token = req.getHeader("Authorization");
        if (StringUtils.isEmpty(token)) {
            return false;
        }
        DecodedJWT jwtToken = WebTokenUtil.decode(token);
        if (jwtToken == null) {
            return false;
        }
        //从JWT里取出存放在payload段里的userid，查询这个用户信息得到用户最后登录时间
        Integer userId = Integer.valueOf(jwtToken.getSubject());
        User user = userDao.selectByPrimaryKey(userId);
        LocalDateTime lastLogin = user.getLastLogin();
        //根据用户登录时间，拿到用户申请Token时的secretKey
        String secretKey = WebTokenUtil.genSecretKey(lastLogin.atZone(ZoneId.systemDefault()).toInstant());

        try {
            //校验
            WebTokenUtil.verify(secretKey, token);
        } catch (SignatureVerificationException e) {
            logger.error(e.getMessage());
            return false;
        } catch (TokenExpiredException e) {
            // 允许一段时间有效时间同时返回新的token
            String newToken = WebTokenUtil.getRefreshToken(secretKey, jwtToken);
            if (StringUtils.isEmpty(newToken)) {
                logger.error(e.getMessage());
                return false;
            }
            logger.debug("Subject : [" + userId + "] token expired, allow get refresh token [" + newToken + "]");
            resp.setHeader("Set-Token", newToken);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
