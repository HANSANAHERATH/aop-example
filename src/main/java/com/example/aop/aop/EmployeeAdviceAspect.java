package com.example.aop.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class EmployeeAdviceAspect {

    /** Advice example */

    /** Before Advice */
    @Before("execution(public * getEmployeeById(*))")
    public void getEmployeeByIdAspectBefore(){
        log.info("getEmployeeByIdAspect on Aspect Class");
        System.out.println("executing getEmployeeByIdAspectBefore on Aspect Class before getEmployeeById service method");
    }

    /** After Advice */
    @After("execution(public com.example.aop.dto.EmployeeDto getEmployeeById(Integer))")
    public void getEmployeeByIdAspectAfter(){
        log.info("getEmployeeByIdAspect on Aspect Class");
        System.out.println("executing getEmployeeByIdAspectAfter on Aspect Class after getEmployeeById service method");
    }

    /**
     * After Advice
     * Can use asterisk (*)
     *
     * */
    @After("execution(public * getEmployeeById(*))")
    public void getEmployeeByIdAspectAfter2(){
        log.info("getEmployeeByIdAspect on Aspect Class");
        System.out.println("executing getEmployeeByIdAspectAfter2 on Aspect Class after getEmployeeById service method");
    }
}
