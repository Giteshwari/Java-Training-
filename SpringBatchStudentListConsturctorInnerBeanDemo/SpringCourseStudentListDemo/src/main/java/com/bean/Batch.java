package com.bean;

import java.util.List;

public class Batch {
    private int batchCode;
    private String courseName;
    private List<Student> students;

//    public int getBatchCode() {
//        return batchCode;
//    }
//
//    public void setBatchCode(int batchCode) {
//        this.batchCode = batchCode;
//    }
//
//    public String getCourseName() {
//        return courseName;
//    }
//
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//
//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }

    public Batch(int batchCode, String courseName, List<Student> students) {
        this.batchCode = batchCode;
        this.courseName = courseName;
        this.students = students;
    }

    public void display(){
        System.out.println("************Batch Information **************");
        System.out.println("\ncom.bean.Batch code: "+batchCode+" Name of Course: "+courseName);
        System.out.println("Student's List is: ");
        for (Student student:students) {
            System.out.println(student.toString());
        }

    }
}
