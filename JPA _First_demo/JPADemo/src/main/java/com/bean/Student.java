package com.bean;

import javax.persistence.*;

@Entity
@Table(name="Student_jpa_table")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int r_no;
    private String name;
    private float percentage;

    public int getR_no() {
        return r_no;
    }

    public void setR_no(int r_no) {
        this.r_no = r_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "r_no=" + r_no +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
