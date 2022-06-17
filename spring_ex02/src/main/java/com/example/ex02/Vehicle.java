package com.example.ex02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dog")
@Lazy
@Qualifier("dog")
@Primary
public class Vehicle implements IThing {
    Vehicle(){
        System.out.println("Vehicle created");
    }
}
