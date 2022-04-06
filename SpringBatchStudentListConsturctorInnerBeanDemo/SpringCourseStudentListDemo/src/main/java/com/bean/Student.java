package com.bean;

public class Student {
    private String name;
    private String qualification;
    private float percentage;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getQualification() {
//        return qualification;
//    }
//
//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }
//
//    public float getPercentage() {
//        return percentage;
//    }
//
//    public void setPercentage(float percentage) {
//        this.percentage = percentage;
//    }


    public Student(String name, String qualification, float percentage) {
        this.name = name;
        this.qualification = qualification;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", qualification='" + qualification + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
