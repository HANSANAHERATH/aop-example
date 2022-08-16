package com.example.aop.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class PersonAnnotationAspect {

    @Before("@annotation(com.example.aop.annotations.Loggable)")
    public void aroundPersonAnnotation(){

        System.out.println("inside person annotation aspect ********");


    }
}
