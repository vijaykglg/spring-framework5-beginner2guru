package com.vijay.learn.spring.springcore.di.controllers;

import com.vijay.learn.spring.springcore.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/*
Project : spring-framework5-beginner2guru
User    : Vijay Gupta
Date    : May 2020
*/
@Controller
public class SetterInjectedController {
    public GreetingService greetingService;

    @Autowired
    @Qualifier("setterInjectedGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void getGreeting() {
        greetingService.sayGreeting();
    }
}
