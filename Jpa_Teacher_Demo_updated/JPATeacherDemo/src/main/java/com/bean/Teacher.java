package com.bean;

import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Table(name="Teacher_Table")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tid;
    private String name;
    private double salary;
    private String deg;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", deg='" + deg + '\'' +
                '}';
    }
}
