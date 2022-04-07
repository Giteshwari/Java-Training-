package com.bean;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private Address Address;

    public Student(int id, String name, com.bean.Address address) {
        this.id = id;
        this.name = name;
        Address = address;
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

    public com.bean.Address getAddress() {
        return Address;
    }

    public void setAddress(com.bean.Address address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address=" + Address +
                '}';
    }
}
