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
public class EmployeePointcutAspect {

    /** AOP Pointcut Example */

    /**
     *  Pointcut for all serviceClass methods
     *
     * */
    @Pointcut("within(com.example.aop.service.*)")
    public void saveEmployeePointcut(){}

    @After("saveEmployeePointcut()")
    public void saveEmployeeAspectAfter(){
        log.info("saveEmployeeAspectAfter on Aspect Class");
        System.out.println("executing saveEmployeeAspectAfter on Aspect Class after saveEmployee service method");
    }

    /**
     * Pointcut for saveEmployee service method
     * */
    @Pointcut("execution(public * saveEmployee(*)))")
    public void saveEmployeePointcut2(){}

    @Before("saveEmployeePointcut2()")
    public void saveEmployeeAspectBefore(){
        log.info("saveEmployeeAspectBefore on Aspect Class");
        System.out.println("executing saveEmployeeAspectBefore on Aspect Class before saveEmployee service method");
    }

}
