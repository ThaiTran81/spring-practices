package com.example.ex03;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PersonServices {
    PersonServices(){
        System.out.println("PersonServices is created");
    }
}
