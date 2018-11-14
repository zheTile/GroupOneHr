package com.groupone.gohr;

import com.groupone.gohr.interceptor.LoginInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * className:MvcConfigClass
 * discriptoin:拦截器配置
 * author:朱得鑫
 * createTime:2018-11-13 21:00
 */
@SpringBootConfiguration //标识该类为配置类
public class MvcConfigClass extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加自定义拦截器 配置拦截路径addPathPattens和不拦截路径excludePathPatterns 多个路径 用 , 隔开
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/index/toIndex");
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
