package com.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
  public String hello(){
        System.out.println("欢迎使用tomcat springmvc");
        return "hello";
    }

}
