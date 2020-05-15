package com.vijay.learn.spring.springcore.di.services;
/*
Project : spring-framework5-beginner2guru
User    : Vijay Gupta
Date    : May 2020
*/

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryBeanGreetingServiceImpl implements GreetingService{
    @Override
    public void sayGreeting() {
        String greeting = "Hello World!!! - From the PrimaryBeanGreetingService";
        System.out.println(greeting);
    }
}
