package com.oraclejava.springdi;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAspect {

    @Before("excution( *com.oraclejava.springdi.StudentService.*(..))")
    public void beforeMethod(JoinPoint jp){
    }
}
