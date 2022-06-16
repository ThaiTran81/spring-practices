package com.example.ex03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(TestConfig.class);

        Person person1 = context.getBean(Person.class);

        person1.setName("person A");
        Person person2 = context.getBean(Person.class);
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        Person person3 = context.getBean(Person.class);
    }
}
