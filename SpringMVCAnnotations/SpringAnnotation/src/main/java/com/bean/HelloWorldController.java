package com.bean;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class HelloWorldController {
    @RequestMapping("/hello")
    public ModelAndView helloWorld()
    {
        String msg = "Hello Spring MVC";
        return new ModelAndView("hello","message",msg);
    }
}