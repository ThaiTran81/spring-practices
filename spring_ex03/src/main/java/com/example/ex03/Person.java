package com.example.ex03;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy
public class Person {
    String name;

    PersonServices personServices;

    Person(PersonServices personServices) {
        System.out.println("Person is created by Spring context");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setPersonServices(PersonServices personServices) {
        this.personServices = personServices;
        System.out.println("Person Services is created by Spring context setter");
    }
}
