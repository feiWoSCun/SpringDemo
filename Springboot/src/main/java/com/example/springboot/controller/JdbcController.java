package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JdbcController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    //查询数据库
    @GetMapping("/userList")
public List<Map<String,Object>> sql(){
    String sql="select * from player";
    List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
    return  maps;
}
}
