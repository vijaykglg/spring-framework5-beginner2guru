package com.vijay.learn.spring.springcore.di.controllers;

import com.vijay.learn.spring.springcore.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/*
Project : spring-framework5-beginner2guru
User    : Vijay Gupta
Date    : May 2020
*/

@Controller
public class ConstructorInjectedController {
    public GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void getGreeting() {
        greetingService.sayGreeting();
    }
}
