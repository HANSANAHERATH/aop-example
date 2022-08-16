package com.example.aop.annotations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
@Component
public class LoggableImpl {

    @Before("@annotation(Loggable)")
    public void loggableMethodImpl(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Method[] declaredMethods = joinPoint.getTarget().getClass().getDeclaredMethods();

        Method selectedMethod = Arrays.stream(declaredMethods).filter(method -> method.getName().equals(methodName)).findFirst().get();

        String key = selectedMethod.getAnnotation(Loggable.class).key();

        System.out.println(key);

    }
}
