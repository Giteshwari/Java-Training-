package com.example.mvc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.mvc.bean.Hello;

@SpringBootApplication
public class SpringAopDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringAopDemoApplication.class, args);
		Hello h = (Hello)context.getBean("hello");
		h.login();
	}

}
