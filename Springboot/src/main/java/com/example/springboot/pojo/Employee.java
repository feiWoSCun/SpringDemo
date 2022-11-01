package com.example.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Data//
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;//0"女，1:男
    private Department department;
    private Date birth;

    public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth=new Date();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", department=" + department +
                ", birth=" + birth +
                '}';
    }
}

