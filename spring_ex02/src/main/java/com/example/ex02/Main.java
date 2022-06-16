package com.example.ex02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(TestConfig.class);

        System.out.println("before call");
        context.getBean(Person.class);
    }
}
