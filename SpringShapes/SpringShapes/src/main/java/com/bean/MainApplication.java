package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Springbean.xml");
        Shapes shape,shape1;
        shape = (Shapes) context.getBean("triangle");
        shape.draw();

        shape1 = (Shapes) context.getBean("circle");
        shape1.draw();



    }
}
