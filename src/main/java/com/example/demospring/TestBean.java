package com.example.demospring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.demospring")
public class TestBean {

//    @Primary
//    @Bean
//    String hello(){
//        System.out.println("I'm bean");
//        return "hello";
//    }
//
//    @Bean(name = "byeCustom")
//    String bye(){
//        System.out.println("Bye bean");
//        return "Bye";
//    }
//
//    @Bean
//    @Primary
//    Vehicle vehicle(){
//        Vehicle vehicle =  new Vehicle();
//        vehicle.setName("audi");
//        return vehicle;
//    }
//
//    @Bean("secondVehicle")
//    Vehicle vehicle1(){
//        Vehicle vehicle =  new Vehicle();
//        vehicle.setName("audi");
//        return vehicle;
//    }
//
//    @Bean
//    Person person(Vehicle vehicle){
//        Person person = new Person();
//        person.setName("Lin");
//        person.setVehicle(vehicle);
//        return person;
//    }
}
