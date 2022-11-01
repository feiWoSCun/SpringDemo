package com.example.springboot.pojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private  Integer number;
    private  String name;
    private String location;

    public static void main(String[] args) {
        Department department = new Department(2021214407, "罗彬", "宜宾");
        try {
            System.out.println(new ObjectMapper().writeValueAsString(department));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
