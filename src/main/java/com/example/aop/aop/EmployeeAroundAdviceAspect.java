package com.example.aop.aop;

import com.example.aop.dto.EmployeeDto;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Aspect
public class EmployeeAroundAdviceAspect {
    /**
     * Around aspect for updateEmployee service class method.
     *
     * here updating values before call updateEmployee method and again catch after execute updateEmployee method
     * */

    @Around("execution(public * updateEmployee(*,*))")
    public void employeeAroundAspect2(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before execute updateEmployee method --------");

        /**
         * catch parsing args and modify them.
         * */
        Object[] args = proceedingJoinPoint.getArgs();
        EmployeeDto employeeDto = (EmployeeDto) args[0];
        employeeDto.setEmployeeName("modified name");

        Object[] modified = {employeeDto,1};

        /**
         *
         * when call proceed method, start execute updateEmployee method
         *
         * here catch the return value of updateEmployee method
         *
         * */
        EmployeeDto valueAfterMethodExecute = (EmployeeDto) proceedingJoinPoint.proceed(modified);

        System.out.println("after execute updateEmployee method ------------");

        System.out.println(valueAfterMethodExecute.getEmployeeName());
        System.out.println(valueAfterMethodExecute.getEmployeeId());
    }
}
