package com.vijay.learn.spring.springcore.di.services;
/*
Project : spring-framework5-beginner2guru
User    : Vijay Gupta
Date    : May 2020
*/

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService{

    @Override
    public void sayGreeting() {
        String greeting = "Hello World!!! - PropertyInjectedGreetingService";
        System.out.println(greeting);
    }
}
