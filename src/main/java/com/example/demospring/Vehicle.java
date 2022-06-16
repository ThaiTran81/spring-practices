package com.example.demospring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {
    private String name;

    @PostConstruct
    void initialize(){
        name ="Honda";
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }
}
