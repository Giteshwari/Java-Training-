package com.bean;

public class Employee {
    private String name;
    private Address Address;

    public Employee(String name, com.bean.Address address) {
        this.name = name;
        Address = address;
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", Address=" + Address +
                '}';
    }
}
