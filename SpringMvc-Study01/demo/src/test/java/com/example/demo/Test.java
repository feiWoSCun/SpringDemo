package com.example.demo;

import com.example.demo.controller.Person;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class Test {
    @Resource
    Person person;
    @org.junit.jupiter.api.Test
    void test(){
        System.out.println(person);
    }
}
