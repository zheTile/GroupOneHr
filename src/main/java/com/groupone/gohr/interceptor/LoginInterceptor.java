package com.groupone.gohr.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * className:LoginInterceptor
 * discriptoin:登录过滤器配置
 * author:朱得鑫
 * createTime:2018-11-13 21:04
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //进入业务之前进行的方法

        /*HttpSession session = request.getSession();
        Map emp =(Map) session.getAttribute("");
        if (emp!=null&&emp.size()>0){
            return true;
        }else{
            response.sendRedirect("");
            return false;
        }*/
        return true;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

        //视图渲染之前执行的方法
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

        //无论如何都会执行的方法
    }
}
