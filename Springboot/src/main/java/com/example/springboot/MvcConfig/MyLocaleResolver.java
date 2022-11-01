package com.example.springboot.MvcConfig;


import org.hibernate.validator.spi.messageinterpolation.LocaleResolverContext;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

//localResolver是用来解析浏览器传过来的语言参数，通过获取前端参数，用-分割，把默认的locale组件重新自定义
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取语言参数
        String language = request.getParameter("language");
        System.out.println("------>"+language);
        Locale aDefault = Locale.getDefault();
        if (!StringUtils.isEmpty(language)) {
            String[] str = language.split("-");
            //国家，地区
            aDefault = new Locale(str[0], str[1]);
        }
        return aDefault;
    }
    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
    }
}