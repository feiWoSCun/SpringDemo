package com.example.springboot.pojo;

import java.util.Date;

public class Designer {
    private  int number;
    private  int id;
    private  String name;
    private Date time;
    private  int salary;

    public Designer() {
    }

    public Designer(int number, int id, String name, Date date, int salary) {
        this.number = number;
        this.id = id;
        this.name = name;
        this.time = date;
        this.salary = salary;
    }
    //get &&  set

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return time;
    }

    public void setDate(Date date) {
        this.time = date;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "number=" + number +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", date=" + time +
                ", salary='" + salary + '\'' +
                '}';
    }
}
