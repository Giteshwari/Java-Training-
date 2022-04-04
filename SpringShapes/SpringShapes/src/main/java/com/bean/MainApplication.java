package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Springbean.xml");
        Shapes shape;
        shape = (Shapes) context.getBean("triangle");
        shape.draw();

       shape= (Shapes) context.getBean("circle");
       shape.draw();



    }
}
