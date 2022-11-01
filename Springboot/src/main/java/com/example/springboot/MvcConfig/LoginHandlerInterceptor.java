package com.example.springboot.MvcConfig;

import org.aopalliance.intercept.Interceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//自定义拦截器
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登陆成功之后，应该要有用户的session
        Object password = request.getSession().getAttribute("username");
        if (StringUtils.isEmpty((String) password)) {
            request.setAttribute("msg", "人生没有捷径可走，请先登录");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        } else
            return true;
    }
}
