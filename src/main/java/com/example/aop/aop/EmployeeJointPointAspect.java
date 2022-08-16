package com.example.aop.aop;

import com.example.aop.dto.EmployeeDto;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class EmployeeJointPointAspect {

    @Before("execution(public * updateEmployee(*,*))")
    public void saveEmployeeJointPoint(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        EmployeeDto arg = (EmployeeDto) args[0];
        System.out.println(arg.getEmployeeName() + " Jointpoint");
    }


    @Before("args(employeeDto, employeeId)")
    public void updateEmployeeJointPointArgs(EmployeeDto employeeDto, Integer employeeId) {
        System.out.println(employeeId + " employeeId");
        System.out.println(employeeDto.getEmployeeName() + " employeeName");
    }
}
