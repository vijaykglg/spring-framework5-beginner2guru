package com.vijay.learn.spring.springcore.di.services;
/*
Project : spring-framework5-beginner2guru
User    : Vijay Gupta
Date    : May 2020
*/

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingServiceImpl implements GreetingService {

    @Override
    public void sayGreeting() {
        String greeting = "Hello World!!! - ConstructorInjectedGreetingService";
        System.out.println(greeting);
    }
}
