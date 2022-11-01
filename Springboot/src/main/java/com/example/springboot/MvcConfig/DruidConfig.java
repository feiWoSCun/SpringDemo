package com.example.springboot.MvcConfig;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;
import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
public class DruidConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDatasource(){
        return new DruidDataSource();
    }
    @Bean
    public ServletRegistrationBean a(){
        ServletRegistrationBean<StatViewServlet> bean=new ServletRegistrationBean<>(new StatViewServlet(),"/druid/*");
        //设置后台有人登陆的账号密码
        HashMap<String,String> initParameters = new HashMap<>();
        initParameters.put("loginUsername","luobin");
        initParameters.put("loginPassword","2825097536");
       /* 禁止谁访问*/
        /*initParameters.put("allow","");*/
        bean.setInitParameters(initParameters);
        return bean;

    }


}
