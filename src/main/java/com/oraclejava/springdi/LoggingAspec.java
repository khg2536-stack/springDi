package com.oraclejava.springdi;

import org.aspectj.lang.annotation.Aspect;
import org.junit.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspec {

    //
    @Before
    public void beforeMethod(){
        System.out.println("예시");
    }
}
