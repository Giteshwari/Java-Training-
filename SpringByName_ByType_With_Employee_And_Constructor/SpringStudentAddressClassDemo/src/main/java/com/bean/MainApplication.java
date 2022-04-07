package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("byType.xml");
        Student std = (Student) ap.getBean("student");
        System.out.println(std);

//        Employee emp = (Employee) ap.getBean("employee");
//        System.out.println(emp);

    }

}
