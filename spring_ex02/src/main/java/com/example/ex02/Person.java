package com.example.ex02;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("cat")
@Lazy
@Qualifier("cat")
public class Person implements IThing {
    String name;

    Person(){
        System.out.println("Person is created by Spring context");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
