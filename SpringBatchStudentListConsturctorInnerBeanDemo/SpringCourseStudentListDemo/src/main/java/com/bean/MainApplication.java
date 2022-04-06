package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Springbean.xml");

        Batch batch = (Batch) applicationContext.getBean("batch");
        batch.display();

        System.out.println(applicationContext.containsBean("batch"));
        System.out.println(applicationContext.isPrototype("batch"));
        System.out.println(applicationContext.isSingleton("batch"));


    }
}
