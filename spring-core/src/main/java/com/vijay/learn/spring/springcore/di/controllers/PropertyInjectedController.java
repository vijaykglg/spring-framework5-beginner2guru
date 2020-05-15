package com.vijay.learn.spring.springcore.di.controllers;
/*
Project : spring-framework5-beginner2guru
User    : Vijay Gupta
Date    : May 2020
*/

import com.vijay.learn.spring.springcore.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propertyInjectedGreetingServiceImpl")
    public GreetingService greetingService;

    public void getGreeting() {
        greetingService.sayGreeting();
    }
}
