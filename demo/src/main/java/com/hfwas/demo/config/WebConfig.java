package com.hfwas.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebConfig
 * @Description TODO
 * @A hfwas
 * @Date: 2:17 上午
 * @Version: 1.0
 **/
@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            //重写这个方法，添加跨域设置
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                //定义哪些URL接受跨域
                registry.addMapping("/**")
                        //定义哪些origin可以跨域请求
                        .allowedOrigins("*")
                        //定义接受的跨域请求方法
                        .allowedMethods("POST", "GET", "PUT", "PATCH", "OPTIONS", "DELETE")
                        .exposedHeaders("Set-Token")
                        .allowCredentials(true)
                        .allowedHeaders("*")
                        .maxAge(3600);
            }
//            //注册拦截器
//            @Override
//            public void addInterceptors(InterceptorRegistry registry) {
//                registry.addInterceptor(userSecurityHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/login", "/dev/**");
//            }
        };
    }
//    //定义拦截器，UserSecurityHandlerInterceptor这个类实现了HandlerInterceptor接口
//    @Bean
//    public UUserSecurityUtilserSecurityHandlerInterceptor userSecurityHandlerInterceptor() {
//        return new UserSecurityHandlerInterceptor();
//    }

}
