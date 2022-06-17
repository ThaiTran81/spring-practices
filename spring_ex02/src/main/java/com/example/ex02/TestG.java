package com.example.ex02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestG {

    public TestG(@Qualifier("cat") IThing cat){

    }
}
