package com.vijay.learn.spring.springcore.di.controllers;

import com.vijay.learn.spring.springcore.di.services.ConstructorInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorInjectedGreetingServiceImpl());//Constructor Based Dependency Injection without Spring
    }

    @Test
    void getGreeting() {
        constructorInjectedController.getGreeting();
    }
}