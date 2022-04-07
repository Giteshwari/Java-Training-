package com.bean;

public class Participants {

    private String name;
    private String Address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Participants{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
