package com.example.demo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.List;
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
//@Email
    String name;
    boolean happy;
    int age;
    public List list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", happy=" + happy +
                ", age=" + age +
                ", list=" + list +
                '}';
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
