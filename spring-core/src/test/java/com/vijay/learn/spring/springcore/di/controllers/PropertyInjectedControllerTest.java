package com.vijay.learn.spring.springcore.di.controllers;

import com.vijay.learn.spring.springcore.di.services.ConstructorInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new ConstructorInjectedGreetingServiceImpl();//Property Dependency Injection  without Spring
    }

    @Test
    void getGreeting() {
        propertyInjectedController.getGreeting();
    }
}