package com.vijay.learn.spring.springcore.di.controllers;

import com.vijay.learn.spring.springcore.di.services.GreetingService;
import org.springframework.stereotype.Controller;

/*
Project : spring-framework5-beginner2guru
User    : Vijay Gupta
Date    : May 2020
*/

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello(){
       greetingService.sayGreeting();
    }
}
