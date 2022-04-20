package com.example.mvc.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	@Before("execution(public void login())")
	public void userPresent(){
		System.out.println("User Verified");
	}
	
	@After("execution(public void login())")
	public void logOut() {
		System.out.println("Logger out");
	}
	
	@Around("execution(public void userPresent())")
	public void registered() {
		System.out.println("Registered");
	}
	
	

}
