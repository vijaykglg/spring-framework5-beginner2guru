package com.vijay.learn.spring.springcore;

import com.vijay.learn.spring.springcore.di.controllers.ConstructorInjectedController;
import com.vijay.learn.spring.springcore.di.controllers.MyController;
import com.vijay.learn.spring.springcore.di.controllers.PropertyInjectedController;
import com.vijay.learn.spring.springcore.di.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringCoreApplication.class, args);
        MyController myController = applicationContext.getBean("myController", MyController.class);
        System.out.println("-------@Primary Bean Example");
        myController.sayHello();

        System.out.println("-------Spring managed DI using Property");
        PropertyInjectedController propertyInjectedController = applicationContext.getBean("propertyInjectedController",PropertyInjectedController.class);
        propertyInjectedController.getGreeting();

        System.out.println("-------Spring managed DI using Setter");
        SetterInjectedController setterInjectedController = applicationContext.getBean("setterInjectedController",SetterInjectedController.class);
        setterInjectedController.getGreeting();

        System.out.println("-------Spring managed DI using Constructor");
        ConstructorInjectedController constructorInjectedController = applicationContext.getBean("constructorInjectedController",ConstructorInjectedController.class);
        constructorInjectedController.getGreeting();
    }

}
